/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author franc
 */
public class Conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql://localhost:3306/cristofy";

    public static Connection getConn() {
        return conn;
    }
    
  
    
    

 
    
public Conectar(){
    conn=null;
    
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url,user,password);
            if (conn!=null)
                System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
                System.out.println("conexion no establecida" +e);
        } 
}
public Connection getConnection(){
    return conn;
}

public void desconectar(){
    conn=null;
    if(conn==null){
        System.out.println("conexion terminada");
    }
} 


}
