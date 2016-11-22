/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class Conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql://localhost:3306/alumnos";
    


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

public void consultar(){
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alumnos");
            
            while(rs.next()){
                String dni=rs.getString("DNI");
                String nombre=rs.getString("nombre");
                String apellido1=rs.getString("apellido1");
                String apellido2=rs.getString("apellido2");

        System.out.println("---------------------------------------------");
        System.out.println(nombre +"  " +dni +"  "+apellido1 +"  " +apellido2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}
