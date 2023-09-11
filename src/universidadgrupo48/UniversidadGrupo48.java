
package universidadgrupo48;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import universidadgrupo48.AccesoDeDatos.AlumnoData;
import universidadgrupo48.Entidades.Alumno;

public class UniversidadGrupo48 {

    public static void main(String[] args) {
        //Alumno juan = new Alumno(3,38439685,"flores"," cristina ",LocalDate.of(2021, Month.MARCH, 3),true);
       // AlumnoData alu = new AlumnoData();
       // alu.guardarAlumno(juan);
        //alu.modificaAlumno(juan);
       // alu.eliminarAlumno(3);
      // Alumno alumnoEncontrado =alu.buscarPorDNI(38439684);
      
        /*if(alumnoEncontrado!=null){
             System.out.println(alumnoEncontrado.toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"alumno no encontrado");
        }*/

      AlumnoData alu =new AlumnoData();
        for (Alumno alumno : alu.listarAlumno()) {
            System.out.println(alumno.toString());
        }
    }
}
    

        
       