/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class Empleado extends Persona {
    private int sueldo;

    public Empleado() {
    }

    public Empleado(int sueldo, int nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.sueldo = sueldo;
    }

    public Empleado(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}
    

