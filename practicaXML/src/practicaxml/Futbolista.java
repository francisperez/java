/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaxml;

/**
 *
 * @author franc
 */
public class Futbolista {
   private int dni;
   private String nombre_futbolista;
   private String nacionalidad;
   private int salario;

    public Futbolista() {
    }

    
    public Futbolista(int dni, String nombre_futbolista, String nacionalidad, int salario) {
        this.dni = dni;
        this.nombre_futbolista = nombre_futbolista;
        this.nacionalidad = nacionalidad;
        this.salario = salario;
    }

    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre_futbolista() {
        return nombre_futbolista;
    }

    public void setNombre_futbolista(String nombre_futbolista) {
        this.nombre_futbolista = nombre_futbolista;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
