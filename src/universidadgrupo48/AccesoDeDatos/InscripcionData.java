package universidadgrupo48.AccesoDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo48.Entidades.Inscripcion;

public class InscripcionData {
  private Connection con=null;
  private MateriaData matData;
  private AlumnoData aluData;
public InscripcionData (){
  con=Conexion.conectar(); 
    
}  
public void guardarInscripcion(Inscripcion insc){
   String sql=" INSERT  INTO inscripcion (nota,idAlumno,idMateria)VALUES (?,?,?) ";
      try {
          PreparedStatement ps =con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); 
          ps.setDouble(1, insc.getNota());
          ps.setInt(2, insc.getAlumno().getIdAlumno());
          ps.setInt(3, insc.getMateria().getIdMateria());
          ps.executeUpdate();
          ResultSet rs= ps.getGeneratedKeys();
        if(rs.next()) { 
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "La inscripcion fue exitosa");
        }
        ps.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en la inscripcion");
      }
  }  
  
}
