/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_labpbo;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class DBConnector {
     public static Connection connection;
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/karyaseni";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static void initDBConnection()
    {
        try {
            Class.forName(JDBC_DRIVER);
            
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
           
            if (connection != null) 
            {
                System.out.println("Connection is established");
            }
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main (String args[]) {
        System.out.println("Connection is established");
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
