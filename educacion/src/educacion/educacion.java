/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacion;

import educa.saludar;
import educa.despedirse;

/**
 *
 * @author franc
 */
public class educacion {
    public static void main(String[] args) {
        saludar s= new saludar();
        despedirse d= new despedirse();
        s.saludo();
        d.despedida();
        
    }
}
