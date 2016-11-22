/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pez;

/**
 *
 * @author 2dam
 */
public class Pez {
    private String nombre;
    static int numPeces;

    public static int getNumPeces() {
        return numPeces;
    }

    @Override
    public String toString() {
        return "Pez{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pez(String nombre) {
        this.nombre = nombre;
        numPeces++;
    }

    public Pez() {
        numPeces++;
    }
    
    public String nadar(){
    String nada="nada";
    return nada;
    }
    
}
