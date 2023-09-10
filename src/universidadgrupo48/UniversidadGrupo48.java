
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
        // Caga de alumnos
        Alumno nuevoAlu = new Alumno(28565768,"Moreno","Mariano",LocalDate.of(1978, Month.MARCH, 24),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //2 
        nuevoAlu = new Alumno(43567345,"Martinez","Carlos",LocalDate.of(1999, Month.APRIL, 2),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //3
        nuevoAlu = new Alumno(42345888,"Kirchuk","Ernesto",LocalDate.of(2000, Month.AUGUST, 15),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //4
        nuevoAlu = new Alumno(40678435,"Groppa","Mariano",LocalDate.of(1998, Month.SEPTEMBER, 18),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //5
        nuevoAlu = new Alumno(39123987,"Groisman","Bernardo",LocalDate.of(1997, Month.SEPTEMBER, 28),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //6
        nuevoAlu = new Alumno(29875676,"Alonso","Pablo",LocalDate.of(1979, Month.DECEMBER, 12),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //7
        nuevoAlu = new Alumno(30789789,"Pernia","Eric",LocalDate.of(1980, Month.JULY, 17),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //8
        nuevoAlu = new Alumno(30454898,"Montero ","Maria",LocalDate.of(1980, Month.MAY, 30),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //9
        nuevoAlu = new Alumno(29708123,"Alonso","Nicolas",LocalDate.of(1979, Month.FEBRUARY, 25),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        //10
        nuevoAlu = new Alumno(28778456,"Pillon","Ignacio",LocalDate.of(1978, Month.JUNE ,13),true);
        alu = new AlumnoData();
        alu.guardarAlumno(nuevoAlu);
        
        //carga de materias
//        
//        Materia nuevaMat = new Materia("Matematicas",1,true);
//        MateriaData mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        ManuevaMat = new Materia("Algebra",1,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Ingles 1",1,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Programacion",1,true);
//        mat = new MateriaData(); 
//        mat.guardarMateria(nuevaMat);
//        
//        //**************
//        nuevaMat = new Materia("Redes",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Digitales",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Laboratorio 1",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Ingles 2",2,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        //******************
//        
//        nuevaMat = new Materia("Sistemas Operativos",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Base de datos",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Electronioca",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
//        
//        nuevaMat = new Materia("Estadistica",3,true);
//        mat = new MateriaData();
//        mat.guardarMateria(nuevaMat);
       

    }
    
}
