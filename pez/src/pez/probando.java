/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pez;

import java.util.ArrayList;

/**
 *
 * @author 2dam
 */
public class probando {
    
    public static void main(String[] args) {
        
        Pez nemo = new Pez("nemo");
        Pez dori = new Pez("dori");
        Sargo tiburon = new Sargo(false,"tiburon");
        System.out.println("Este el numero de peces creados "+ Pez.getNumPeces());
        System.out.println("Este es el nombre del pez "+nemo.getNombre());
        
        //Arrays
       ArrayList<Pez> cadena_peces = new ArrayList<>() ;
       cadena_peces.add(nemo);
       cadena_peces.add(dori);
       cadena_peces.add(tiburon);//Este es de tipo sargo
       
       cadena_peces.get(2).setNombre("coki");
       
       for (int i=0; i<cadena_peces.size(); i++){
           System.out.println("Nombre de los peces "+cadena_peces.get(i).getNombre());
       }  
       
       for (int i=0; i<cadena_peces.size(); i++){
           System.out.println("Manera de nadar "+cadena_peces.get(i).nadar());
       }  
    };
        
}

