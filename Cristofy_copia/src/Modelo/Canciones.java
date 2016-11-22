/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author franc
 */
public class Canciones {
    private String nombreTabla="canciones";
    private String titulo;
    private String artista;
    private int duracion;
    private String calidad;
    private int valoracion;

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

   
    public Canciones() {
    }

    public Canciones(String titulo, String artista, int duracion, String calidad, int valoracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.calidad = calidad;
        this.valoracion = valoracion;
    }
     public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
    public  String insertarCancion(){
        String cancion = null;
        
        
        return cancion;
    
    }
    
}
