/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author giova
 */
public class ConnectionMySQL {
    private String database_name = "pharmacy_database";
    private String user = "root";
    private String password = "toor";
    private String url = "jdbc:mysql://localhost:3306/" + database_name;
    Connection conn = null;
    
    public Connection getConnection() {
        try{
            // obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // obtenemos la conexion
            conn = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException e) {
            System.err.println("Ha ocurrido un ClassNotFoundException " + e.getMessage());
        }catch(SQLException e) {
            System.err.println("ha ocurrido un SQLException " + e.getMessage());
        }
        return conn;
    }
    
    
}
