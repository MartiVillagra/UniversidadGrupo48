package universidadgrupo48.AccesoDeDatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo48.Entidades.Alumno;
import universidadgrupo48.Entidades.Inscripcion;
import universidadgrupo48.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;
    private InscripcionData inscData;

    public InscripcionData() {
        con = Conexion.conectar();
        aluData = new AlumnoData();
        matData = new MateriaData();
       // inscData = new Inscripcion();
    }
//************** Resive un dato inscripcion y lo guarda en la tabla incripcion
    
    public void guardarInscripcion(Inscripcion insc) {
        String sql = " INSERT  INTO inscripcion (nota,idAlumno,idMateria)VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La inscripcion fue exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la inscripcion");
        }
    }
    
//*************************** Nos devuelve una lista con todas lass incripciones
    
    public ArrayList<Inscripcion> obtenerInscripciones() {
    /*  String sql = "SELECT * FROM inscripcion ";
        Al utilizar esta consulta nos debuelve bien el resultado si tanto el estado de la materia como 
        el estado del alumno estan en verdadero caso contrario tira error*/
        String sql = "SELECT * FROM inscripcion ins,alumno alu,materia ma where ins.idMateria= ma.idMateria "
                + "and ins.idAlumno= alu.idAlumno and ma.estado=1 and alu.estado=1";
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt(1));
                insc.setNota(rs.getInt(2));
                Alumno alu = aluData.buscarPorID(rs.getInt(3));
                Materia mat = matData.buscarMateriaPorID(rs.getInt(4));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en Inscripciones");
        }
        return inscripciones;

    }
    
// ********** se pasa el idAlumno y se reciven todas las inscripciones del alumno
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "SELECT ins.idAlumno,nota,ins.idMateria,idInscripcion, ma.nombre as materia,apellido,alu.nombre, nota FROM inscripcion ins JOIN materia ma"
                + ",alumno alu  WHERE ins.idAlumno=? AND ins.idAlumno = alu.idAlumno AND ins.idMateria = ma.idMateria ";
       
ArrayList<Inscripcion> inscripciones = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarPorID(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateriaPorID(rs.getInt("idMateria"));
                insc.setNota(rs.getDouble("nota"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                mat.setNombre(rs.getString("materia"));               
            inscripciones.add(insc);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla inscripcion");
        }
     return inscripciones;
    }
    
//********************Paso idAlumnono y muestro materia que esta cuersando(solo materias)
    
    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        
        ArrayList <Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(); 
            
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
            materias.add(materia);  
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se encontraron datos ");
        }
        return materias;
    }
 
//******************Paso idAlumnono y muestro materia que no esta inscripto(usar el gestor)
    public ArrayList<Materia> obtenerMateriaNoCursada(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        // not in--> excepto lo otro/ no tenga el idMateria del alumno seleccionado
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
            materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la tabla materia" + ex);
        }
        return materias;
    }
    
//************* recibe el idAlumno e idMatria  y la nota que modifica
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion  SET nota =? WHERE idAlumno =?  AND idMateria=?  ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int respuesta = ps.executeUpdate();   
            if(respuesta==1){      
                JOptionPane.showMessageDialog(null,"Nota modificada");    
            }
            ps.close();
        } catch (SQLException ex) {   
                JOptionPane.showMessageDialog(null, "no se pudo modificar la nota ");
        }
    }    

//*********** se pasa el alumno y la materia. Y se borra la inscripcion o idInscripcion
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {      

        String sql = "DELETE  FROM inscripcion  WHERE idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito =ps.executeUpdate();
                if(exito==1){
                JOptionPane.showMessageDialog(null,"Iscripcion eliminada");        
            }
        } catch (SQLException ex) {   
                JOptionPane.showMessageDialog(null, "no se pudo eliminar la iscripcion ");
        }
    }

    public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria) {
        //materias por alumno
    /*SELECT anio, ma.nombre as materia, dni, apellido, alu.nombre FROM materia ma ,alumno alu, 
    inscripcion ins WHERE ins.idMateria =ma.idMateria and ins.idAlumno=alu.idAlumno AND ins.idAlumno=3  */  
        ArrayList <Alumno> materiaAlumnos = new ArrayList();
        
    String  sql ="SELECT anio, ma.nombre as materia, dni, apellido, alu.nombre "
            + "FROM materia ma ,alumno alu, inscripcion ins WHERE ins.idMateria = ma.idMateria "
            + "and ins.idAlumno=alu.idAlumno AND ins.idMateria=?;";         
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));    
            materiaAlumnos.add(alumno);
            }
            ps.close();     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erroa al procesar el listado de alumnos ");
        }  
        return materiaAlumnos;        
    }
}
