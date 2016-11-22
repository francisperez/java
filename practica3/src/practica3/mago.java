/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author franc
 */
public class mago extends personaje {

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public double getValoracion_actual() {
        return valoracion_actual;
    }

    public void setValoracion_actual(double valoracion_actual) {
        this.valoracion_actual = valoracion_actual;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTransferilble() {
        return transferilble;
    }

    public void setTransferilble(boolean transferilble) {
        this.transferilble = transferilble;
    }

    public mago(int mana, String nombre, int id, int fuerza, int destreza, int resistencia, double valoracion_actual, double precio, boolean transferilble) {
        super(nombre, id, fuerza, destreza, resistencia, valoracion_actual, precio, transferilble);
        this.mana = mana;
    }

    public mago(int mana) {
        this.mana = mana;
    }

    public mago() {
    }
    protected int mana;
    
}
