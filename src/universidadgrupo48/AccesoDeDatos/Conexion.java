/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo48.AccesoDeDatos;

import universidadgrupo48.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nova
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadgr48";
    private static final String USUARIO = "root";
    private static final String PASS = "";
    private static Connection conn;

    private Conexion() {}
    
    public static Connection conectar(){
        if (conn==null) {
         try {
            Class.forName("org.mariadb.jdbc.Driver"); 
            System.out.println("conectado con exito");
            conn=DriverManager.getConnection(URL+DB,USUARIO,PASS);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión");
        }   
        }
        
        return conn;
    } 
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("No se pudo desconectar");
        }
    }
    
     
            
}
