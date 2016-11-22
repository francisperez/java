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
public class Vehiculo {
    
    private int velocidad;
    private String color;
    static int numVehiculos;

    public Vehiculo(int velocidad, String color) {
        this.velocidad = velocidad;
        this.color = color;
        numVehiculos++;
    }
    

    public Vehiculo() {
        numVehiculos++;
    }
    
     public void acelerar(int velo){
       this.velocidad +=velo; //this.velocidad=velo+this.velocidad
}

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumVehiculos() {
        return numVehiculos;
    }

    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }


    /**
     * @param args the command line arguments
     */

    
}
