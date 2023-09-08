
package universidadgrupo48;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo48.AccesoDeDatos.AlumnoData;
import universidadgrupo48.Entidades.Alumno;

public class UniversidadGrupo48 {

    public static void main(String[] args) {
        Alumno juan = new Alumno(123986543,"Ma","Jbh",LocalDate.of(2021, Month.MARCH, 3),true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);
        
        
        
    }
    
}
