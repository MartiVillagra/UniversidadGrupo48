
package universidadgrupo48;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import universidadgrupo48.AccesoDeDatos.AlumnoData;
import universidadgrupo48.AccesoDeDatos.Conexion;
import universidadgrupo48.AccesoDeDatos.InscripcionData;
import universidadgrupo48.AccesoDeDatos.MateriaData;
import universidadgrupo48.Entidades.Alumno;
import universidadgrupo48.Entidades.Inscripcion;
import universidadgrupo48.Entidades.Materia;

public class UniversidadGrupo48 {

    public static void main(String[] args) {
 //       Connection con = Conexion.getConexion(); 
 
//*************************Guardar alumno*********************
/*
        Alumno juan = new Alumno(38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);
*/
//**************************Modificar alumno************************
/*
        Alumno juan = new Alumno(38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
        AlumnoData alu = new AlumnoData();
        alu.modificaAlumno(juan);
*/
//************************Eliminar alumno**************************
/*
        Alumno juan = new Alumno(38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
        AlumnoData alu = new AlumnoData();
        alu.eliminarAlumno(3);
*/
//*************************Buscar alumno por dni**************************
/*
        AlumnoData alu = new AlumnoData();
        Alumno alumnoEncontrado =alu.buscarPorDNI(38439684);
        if(alumnoEncontrado!=null){
             System.out.println(alumnoEncontrado.toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"alumno no encontrado");
        }
*/
// ******************************Listar alumnos***********************
/*
        AlumnoData alu =new AlumnoData();
        for (Alumno alumno : alu.listarAlumno()) {
            System.out.println(alumno.toString());
        }
*/
//************************guardar materia************************
/*
        Materia lengua = new Materia("base de datos",1,true);    
        MateriaData data1 = new MateriaData();
        data1.guardarMateria(lengua);
*/
 //*********************buscar por materia ]***************  
/*
      MateriaData data1 = new MateriaData();
      Materia materiaEncontrada = data1.buscarMateriaPorID(1);
      if (materiaEncontrada != null){
          System.out.println(materiaEncontrada.toString());
      }
*/
//*******************Modificar materia ***********************
/*
       Materia lengua = new Materia("base de datos",1,true); 
       Matria(1,"matematica",2,true);
       MateriaData data= new MateriaData();
       data.modificarMateria(leng);
*/
//*******************eliminar amteria***********************
/*
        MateriaData data= new MateriaData();
        data.eliminarMateria(3);
*/
//******************listar materia***************************
/*
      for (Materia materia : data.listarMateria()){
         System.out.println(materia.toString()); 
      }
*/
//********************inscripcion guardar iscripcion*************************
/*     
     Alumno juan = new Alumno(1,38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
     Materia lengua = new Materia(1,"base de datos",1,true)
     InscripcionData insData= new InscripcionData();
     Inscripcion insc =new Inscripcion(juan, lengua, 7);
     insData.guardarInscripcion(insc);
*/
//***************obtener inscripcion***************
 /*       InscripcionData insData= new InscripcionData();
        for (Inscripcion inscripcion : insData.obtenerInscripciones()) {
            System.out.print("idInscripcion: "+inscripcion.getIdInscripcion());
            System.out.print(" Nota: "+inscripcion.getNota());
            System.out.print(" idAlumno: "+inscripcion.getAlumno().getIdAlumno());
            System.out.print(" idMateria: "+inscripcion.getMateria().getIdMateria());
            System.out.println("");
        }
 */
 //*************** obtener inscripcion por alumno ******************
 /*       InscripcionData insData= new InscripcionData();   
       for (Inscripcion inscripcion : insData.obtenerInscripcionesPorAlumno(1)){
         
         System.out.println(" idInscripcion " + inscripcion.getIdInscripcion());
         System.out.println(" idAlumno "  + inscripcion.getAlumno().getIdAlumno());
         System.out.println(" idMateria " + inscripcion.getMateria().getIdMateria());
         System.out.println(" nombre materia " + inscripcion.getMateria().getNombre());
         System.out.println(" nombre alumno "  + inscripcion.getAlumno().getNombre());
         System.out.println(" apellido alumno "  + inscripcion.getAlumno().getApellido());
         System.out.println("--------------------------------------------------------");
     }
*/
 //**************************Obtener  materias cursadas*********************************************
 /*     
        InscripcionData insData= new InscripcionData();
        for (Materia materia : insData.obtenerMateriasCursadas(3)){
            System.out.println("idMateria " + materia.getIdMateria());
            System.out.println("Nombre " + materia.getNombre());
            System.out.println("Año " + materia.getAnioMateria());
        }
 */
 //**************************Obtener  materias no cursadas*********************************************
 /*    
        InscripcionData insData= new InscripcionData();
        for (Materia materia : insData.obtenerMateriaNoCursada(1)){
            System.out.println("idMateria " + materia.getIdMateria());
            System.out.println("Nombre " + materia.getNombre());
            System.out.println("Año " + materia.getAnioMateria());
        }
 */
//********************* Eliminar inscripcion  idMateria y por idAlumno*****
/*
        MateriaData data= new MateriaData(); 
        AlumnoData alu = new AlumnoData();  
        InscripcionData ins = new InscripcionData();
        data.buscarMateriaPorID(8);
        alu.buscarPorID(3);
        ins.actualizarNota(3, 8, 7);       
 */      
//********************* Cambiar nota por  idMateria y por idAlumno*****
/*
        MateriaData data= new MateriaData();
        AlumnoData alu = new AlumnoData(); 
        InscripcionData ins = new InscripcionData();
        
        ins.borrarInscripcionMateriaAlumno(1, 1);     
*/

//*********************Obtiene Alumnos por Materia*****  
        
        InscripcionData ins = new InscripcionData();
        
//        for (Materia materia: ins.obtenerAlumnosXMateria(5)){
//            System.out.println("nombre"+materia.getNombre());
//System.out.println(" nombre materia " + inscripcion.getMateria().getNombre());
//        }
    for (Alumno alumno: ins.obtenerAlumnosXMateria(5)){

         System.out.println(" idAlumno "  + alumno.getIdAlumno());
         System.out.println(" dni " + alumno.getDni());
         System.out.println(" apellido alumno "  + alumno.getApellido());
         System.out.println(" nombre alumno "  + alumno.getNombre());
         System.out.println("--------------------------------------------------------");
        }
    }         
}  
    