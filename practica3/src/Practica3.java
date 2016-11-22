/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import practica3.guerrero;
import practica3.jugador;
import practica3.mago;
import practica3.picaro;
import practica3.gladiator;


/**
 *
 * @author franc
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    jugador francis = new jugador();
    francis.setLogin("francis");
    francis.setPassword("cheetos");
    
    mago gargamel = new mago();
    gargamel.setMana(5);
    System.out.println(+gargamel.getMana());
    
    picaro spiderman = new picaro(8);
    System.out.println(+spiderman.getEnergia());
    
    guerrero alistair = new guerrero(8,"aldair",78,45,88,78,1255,14,true);
    System.out.println(alistair.getDestreza());
    
  
    jugador [] cheetos = new jugador[10];
               cheetos[0].setLogin("cheetos");
               cheetos[0].setPassword("algo");
               System.out.println(cheetos [0].getLogin());

    
    gladiator nuevo = new gladiator();
    nuevo.setLista_jugadores(cheetos);
    nuevo.Bienvenida();

    }
}
