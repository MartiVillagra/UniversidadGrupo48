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
public class Conection {
    private String url,bd,usuario,pass,driver;
    private Connection conn;

    public Conection() {
        url = "jdbc:mariadb://localhost/";
        bd = "universidadgr48";
        usuario = "root";
        pass = "";
        driver = "org.mariadb.jdbc.Driver";
    }
    public Connection conectar(String bd){
        try {
            Class.forName(driver); 
            conn=DriverManager.getConnection(url+bd,usuario,pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión");
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
