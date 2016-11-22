/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehículo;

/**
 *
 * @author franc
 */
public class Piloto {
    
   private String nombre;
   private int dorsal;

    public String getNombre() {
        return nombre;
    }

    public Piloto(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public Piloto() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
}
