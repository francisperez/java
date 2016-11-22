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

/*public void insertarCancion(){
        try {
           PreparedStatement pst=conectar.getConnection().prepareStatement("INSERT INTO canciones (titulo,artista,duracion,calidad,valoracion) VALUES (?,?,?,?,?)");
           pst.setString(1, vista.devolverCancion().getTitulo());
           pst.setString(2, vista.devolverCancion().getArtista());
           pst.setInt(3, vista.devolverCancion().getDuracion());
           pst.setString(4, vista.devolverCancion().getCalidad());
           pst.setInt(5, vista.devolverCancion().getValoracion());
           pst.executeUpdate();
            
            pst.setString(1, "1");
            pst.setString(2, "1");
            pst.setInt(3, 1);
            pst.setString(4, "1");
            pst.setInt(5, 1);
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

}*/


    
}
