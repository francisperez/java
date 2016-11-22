/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaxml;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Equipo {
   private String nombre_equipo;
   private String estadio;
   private int goles_favor;
   private int goles_contra;
   private ArrayList<Futbolista> array_futbolista = new ArrayList<>();
    
   

    public Equipo(String nombre_equipo, String estadio, int goles_favor, int goles_contra) {
        this.nombre_equipo = nombre_equipo;
        this.estadio = estadio;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
    }

    public Equipo() {
    }

    
    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }

    public ArrayList<Futbolista> getArray_futbolista() {
        return array_futbolista;
    }

    public void setArray_futbolista(ArrayList<Futbolista> array_futbolista) {
        this.array_futbolista = array_futbolista;
    }
    
    
}
