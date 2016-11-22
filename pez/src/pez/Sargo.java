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
public class Sargo extends Pez {

    public boolean isPuntonegro() {
        return puntonegro;
    }

    public void setPuntonegro(boolean puntonegro) {
        this.puntonegro = puntonegro;
    }
    private boolean puntonegro;

    public Sargo(boolean puntonegro, String nombre) {
        super(nombre);
        this.puntonegro = puntonegro;
    }
    public Sargo(String nombre) {
        super(nombre);
    }
    public Sargo() {
    }
    public String nadar(){
    String argo="argo";
    return argo;
    }
    
    
}
