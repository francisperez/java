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
public class Prueba {
      public static void main(String[] args) {
          
          F1 Mercedes = new F1();
          F1 Maclaren= new F1();
          F1 Manor= new F1();
          Vehiculo Ibiza = new Vehiculo();
          Piloto Hamilton = new Piloto();
          Piloto Manolillo = new Piloto();
          
          Mercedes.setColor("plata");
          Maclaren.setColor("gris");
          Manor.setColor("blanco");
          
          Hamilton.setNombre("Hamilton");
          Manolillo.setNombre("Manolillo");
          Piloto [] vector_pilotos=new Piloto[2];
          vector_pilotos[0]=Hamilton;
          vector_pilotos[1]=Manolillo;
          
          
          F1 Renault= new F1(vector_pilotos,"Mercedes");
          Renault.setMonoplaza(vector_pilotos);
          for (int i=0; i<vector_pilotos.length; i++){
              System.out.println(vector_pilotos[i].getNombre());
          }
          
          
          Mercedes.acelerar(30);
          Ibiza.acelerar(30);
          
          System.out.println(Mercedes.getVelocidad());
          System.out.println(Ibiza.getVelocidad());
          
         
          
          
    }  
}
