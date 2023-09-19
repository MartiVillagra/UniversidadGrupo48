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

    public InscripcionData() {
        con = Conexion.conectar();
        aluData = new AlumnoData();
        matData = new MateriaData();

    }

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

    public ArrayList<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT * FROM inscripcion ";

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

    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "SELECT ins.idAlumno,ins.idMateria,idInscripcion, ma.nombre as materia,apellido,alu.nombre FROM inscripcion ins JOIN materia ma"
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

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        String sql= "SELECT ins.idMateria, nombre, anio FROM inscripcion ins, materia ma,"
                + "WHERE ins.idMateria = ma.idMateria AND ins.idAlumno = ?";
        ArrayList <Materia>materias = new ArrayList();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            System.out.println("-1");
            ResultSet rs = ps.executeQuery();    
            System.out.println("0");
            
            Materia materia;
            
            while(rs.next()){
                
                materia = new Materia();
                
                System.out.println("1");
                
                
                System.out.println("2");
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

    public ArrayList<Materia> obtenerMateriaNoCursada(int id) {

        return null;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }

    public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria) {

        return null;

    }
}
