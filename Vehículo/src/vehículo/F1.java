/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehículo;

/*
 *
 * @author franc
 */
public class F1 extends Vehiculo {
    
    public  Piloto [] monoplaza;
    private String escuderia;
    private final int num_ruedad=4; 

    public Piloto[] getMonoplaza() {
        return monoplaza;
    }

    public void setMonoplaza(Piloto[] monoplaza) {
        this.monoplaza = monoplaza;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public F1(Piloto[] monoplaza, String escuderia, int velocidad, String color) {
        super(velocidad, color);
        this.monoplaza = monoplaza;
        this.escuderia = escuderia;
    }

    public F1(Piloto[] monoplaza, String escuderia) {
        this.monoplaza = monoplaza;
        this.escuderia = escuderia;
    }

    public F1() {
    }

    
    
}
