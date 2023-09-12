/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadgrupo48.AccesoDeDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo48.Entidades.Materia;

/**
 *
 * @author Loboplateado77
 */
public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
    
    con = Conexion.conectar();
    }
    

    public void guardarMateria(Materia materia){
      
        String sql = "INSERT INTO materia ( nombre, anio, estado) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            //ejecutar la sentencia
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));    
            JOptionPane.showMessageDialog(null, "Materia añadida con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
}
    
    public Materia buscarMateriaPorID(int id){
    
    String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria = ? ";
        
        Materia materia = null;
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            materia = new Materia();
            materia.setIdMateria(id);
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("anio"));
            materia.setActivo(true);
            } else {
            JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla Materia.");
        }
        return materia;
        
    }
}
    

