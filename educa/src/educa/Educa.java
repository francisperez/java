/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educa;


/**
 *
 * @author franc
 */
public class Educa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saludar s= new saludar();
        despedirse d= new despedirse();
        s.saludo();
        d.despedida(); 
    }
    
}
