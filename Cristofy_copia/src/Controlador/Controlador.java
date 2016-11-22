/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Canciones;
import Modelo.Conectar;
import Modelo.Usuarios;
import Vista.Formulario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class Controlador {

    public Controlador() {
    }
    
    Conectar conectar= new Conectar();
    Usuarios nuevo= new Usuarios();
    Canciones nueva=new Canciones();
    ArrayList<Canciones> cadena_canciones = new ArrayList<>();
    Formulario vista= new Formulario();
    
    
    public void conectando(){
        conectar.getConnection();
    }
    
    public boolean consultarUsuarios(String dato1, String dato2){
        
        boolean verdadero=false;
        
        try {
            Statement st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM "+nuevo.getNombreTabla());
            
            while(rs.next()){
                String login=rs.getString("login");
                String pass=rs.getString("pass");
                
                if ((dato1.equals(login))&&(dato2.equals(login))){
                    return verdadero=true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verdadero=false;
}
    

//public ArrayList<Canciones> insertarCancion()
public ArrayList<Canciones> mostrarCancion(){
          
       try {
            Statement st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM "+nueva.getNombreTabla());
            
            while(rs.next()){
                Canciones nueva2=new Canciones();
                nueva2.setTitulo(rs.getString("titulo"));
                nueva2.setArtista(rs.getString("artista"));
                nueva2.setDuracion(Integer.parseInt(rs.getString("duracion")));
                nueva2.setCalidad(rs.getString("calidad"));
                nueva2.setValoracion(Integer.parseInt(rs.getString("valoracion")));
      
                cadena_canciones.add(nueva2); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return cadena_canciones;
     
}

public void insertarCancion(String dato, String dato2, int num1, String dato3, int num2){
        try {
           PreparedStatement pst=conectar.getConnection().prepareStatement("INSERT INTO canciones (titulo,artista,duracion,calidad,valoracion) VALUES (?,?,?,?,?)");
           pst.setString(1, dato);
           pst.setString(2, dato2);
           pst.setInt(3, num1);
           pst.setString(4, dato3);
           pst.setInt(5, num2);
           pst.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

}


    
}
