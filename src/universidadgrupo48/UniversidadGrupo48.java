
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
       // Alumno juan = new Alumno(38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
        //AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(juan);
        //alu.modificaAlumno(juan);
       // alu.eliminarAlumno(3);
      // Alumno alumnoEncontrado =alu.buscarPorDNI(38439684);
      
        /*if(alumnoEncontrado!=null){
             System.out.println(alumnoEncontrado.toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"alumno no encontrado");
        }*/

      /*AlumnoData alu =new AlumnoData();
        for (Alumno alumno : alu.listarAlumno()) {
            System.out.println(alumno.toString());
        }*/
      
         // Materia lengua = new Materia("base de datos",1,true);    
//        MateriaData data1 = new MateriaData();
//        data1.guardarMateria(lengua);
   
//      
//      Materia materiaEncontrada = data1.buscarMateriaPorID(1);
//      if (materiaEncontrada != null){
//          System.out.println(materiaEncontrada.toString());
//      }

////        Matria(1,"matematica",2,true);
//          MateriaData data= new MateriaData();
////        data.modificarMateria(leng);
//          // eliminar amteria
//          //data.eliminarMateria(3);
//          //listar materia
//          for (Materia materia : data.listarMateria()){
//              System.out.println(materia.toString()); 
     //*********************************************
     // inscripcion guardar iscripcion
     
     Alumno juan = new Alumno(1,38439123,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
     Materia lengua = new Materia(1,"base de datos",1,true);
     
     InscripcionData insData= new InscripcionData();
     Inscripcion insc =new Inscripcion(juan, lengua, 7);
     insData.guardarInscripcion(insc);
     
        }
          
    }
      
      
    
    

        
       