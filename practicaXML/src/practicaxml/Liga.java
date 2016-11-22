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
public class Liga {
   private String nom_liga;
   private String pais_liga; 
   private ArrayList<Equipo> array_equipo = new ArrayList<>();

    public Liga() {
    }

    public Liga(String nom_liga, String pais_liga) {
        this.nom_liga = nom_liga;
        this.pais_liga = pais_liga;
    }

    public String getNom_liga() {
        return nom_liga;
    }

    public void setNom_liga(String nom_liga) {
        this.nom_liga = nom_liga;
    }

    public String getPais_liga() {
        return pais_liga;
    }

    public void setPais_liga(String pais_liga) {
        this.pais_liga = pais_liga;
    }

    public ArrayList<Equipo> getArray_futbolista() {
        return array_equipo;
    }

    public void setArray_futbolista(ArrayList<Equipo> array_futbolista) {
        this.array_equipo = array_equipo;
    }
    
    
}
