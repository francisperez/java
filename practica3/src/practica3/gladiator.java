/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class gladiator {
    protected jugador[]lista_jugadores;
    protected int total_jugadores;
    protected personaje[]pesonaje_mercado;
    protected int total_mercado;
    protected double dinero_total; 

    public jugador[] getLista_jugadores() {
        return lista_jugadores;
    }

    public void setLista_jugadores(jugador[] lista_jugadores) {
        this.lista_jugadores = lista_jugadores;
    }

    public int getTotal_jugadores() {
        return total_jugadores;
    }

    public void setTotal_jugadores(int total_jugadores) {
        this.total_jugadores = total_jugadores;
    }

    public personaje[] getPesonaje_mercado() {
        return pesonaje_mercado;
    }

    public void setPesonaje_mercado(personaje[] pesonaje_mercado) {
        this.pesonaje_mercado = pesonaje_mercado;
    }

    public int getTotal_mercado() {
        return total_mercado;
    }

    public void setTotal_mercado(int total_mercado) {
        this.total_mercado = total_mercado;
    }

    public double getDinero_total() {
        return dinero_total;
    }

    public void setDinero_total(double dinero_total) {
        this.dinero_total = dinero_total;
    }

    public gladiator(jugador[] lista_jugadores, int total_jugadores, personaje[] pesonaje_mercado, int total_mercado, double dinero_total) {
        this.lista_jugadores = lista_jugadores;
        this.total_jugadores = total_jugadores;
        this.pesonaje_mercado = pesonaje_mercado;
        this.total_mercado = total_mercado;
        this.dinero_total = dinero_total;
    }
    
      public gladiator() {
    }
    
    

    public void Bienvenida(){
String login = null, contrasena = null;
Scanner sc = new Scanner(System.in);
boolean entra=false;
for(int i=0; this.total_jugadores>=i; i++){
    Object password = null;
        if ((this.lista_jugadores[i].getLogin().equals(login))&&(this.lista_jugadores[i].getPassword().equals(password)))
            entra= true;
         else
            entra=false;
	do{


		System.out.println(); 
		System.out.println();

		System.out.println("  /$$$$$$  /$$        /$$$$$$  /$$$$$$$  /$$$$$$  /$$$$$$  /$$$$$$$   /$$$$$$  /$$$$$$$  /$$$$$$$$  /$$$$$$ ");
		System.out.println(" /$$__  $$| $$       /$$__  $$| $$__  $$|_  $$_/ /$$__  $$| $$__  $$ /$$__  $$| $$__  $$| $$_____/ /$$__  $$");
		System.out.println("| $$   __/| $$      | $$    $$| $$    $$  | $$  | $$    $$| $$    $$| $$    $$| $$    $$| $$      | $$   __/");
		System.out.println("| $$ /$$$$| $$      | $$$$$$$$| $$  | $$  | $$  | $$$$$$$$| $$  | $$| $$  | $$| $$$$$$$/| $$$$$   |  $$$$$$ ");
		System.out.println("| $$|_  $$| $$      | $$__  $$| $$  | $$  | $$  | $$__  $$| $$  | $$| $$  | $$| $$__  $$| $$__/     _ ___  $$");
		System.out.println("| $$    $$| $$      | $$  | $$| $$  | $$  | $$  | $$  | $$| $$  | $$| $$  | $$| $$    $$| $$       /$$    $$");
		System.out.println("|  $$$$$$/| $$$$$$$$| $$  | $$| $$$$$$$/ /$$$$$$| $$  | $$| $$$$$$$/|  $$$$$$/| $$  | $$| $$$$$$$$|  $$$$$$/");
		System.out.println("  ______/ |________/|__/  |__/|_______/ |______/|__/  |__/|_______/   ______/ |__/  |__/|________/  ______/ ");
		                                                                                                            
		System.out.println(); 
		System.out.println();                                                                                                        
		                                                                                                            
		System.out.println("                              /$$$$$$$  /$$$$$$$$        " );                                                      
		System.out.println("                             | $$__  $$| $$_____/        " );                                                      
		System.out.println("                             | $$    $$| $$             " );                                                       
		System.out.println("                             | $$  | $$| $$$$$         " );                                                       
		System.out.println("                             | $$  | $$| $$__/         " );                                                        
		System.out.println("                             | $$$$$$$/| $$$$$$$$     " );                                                         
		System.out.println("                            |_______/ |________/      " );                                                        
		                                                                                                             
		System.out.println(); 
		System.out.println();                                                                                                        
		                                                                                                            
		System.out.println("  /$$$$$$  /$$$$$$$  /$$$$$$  /$$$$$$  /$$$$$$$$ /$$$$$$        /$$$$$$$  /$$$$$$$$ /$$     /$$         " ); 
		System.out.println(" /$$__  $$| $$__  $$|_  $$_/ /$$__  $$|__  $$__//$$__  $$      | $$__  $$| $$_____/|  $$   /$$/        " );  
		System.out.println("| $$   __/| $$    $$  | $$  | $$   __/   | $$  | $$    $$      | $$    $$| $$          $$ /$$/        " );   
		System.out.println("| $$      | $$$$$$$/  | $$  |  $$$$$$    | $$  | $$  | $$      | $$$$$$$/| $$$$$        $$$$/        " );   
		System.out.println("| $$      | $$__  $$  | $$    ____  $$   | $$  | $$  | $$      | $$__  $$| $$__/         $$/        " );     
		System.out.println("| $$    $$| $$    $$  | $$   /$$    $$   | $$  | $$  | $$      | $$    $$| $$          | $$        " );     
		System.out.println("|  $$$$$$/| $$  | $$ /$$$$$$|  $$$$$$/   | $$  |  $$$$$$/      | $$  | $$| $$$$$$$$    | $$     " );       
		System.out.println("  ______/ |__/  |__/|______/  ______/    |__/    ______/       |__/  |__/|________/    |__/    " );           
		                                                                                                            
		System.out.println(); 
		System.out.println();
		System.out.println("\n\t\t\tINTRODUZCA SU LOGIN: ");
                login = sc.nextLine();
		
		System.out.println("\n\t\t\tINTRODUZCA SU PASSWORD: ");
                contrasena = sc.nextLine();
		
		
		if(entra==false)
                System.out.println("\n\t\tlogin o password incorrecto, vuelva a loguearse");
	}while(entra!=true);
}
    }
  public void menu(){
 char c='0';
 Scanner sc = new Scanner(System.in);
 do{
 System.out.println("<<BIENVENIDO AL COLISEO DE LUCHA GLADIATOR CRISTO REY>>");
 System.out.println("Administrador del Sistema");
 System.out.println("Acciones del jugador en el Coliseum");
 System.out.println("Pulsa << s >> para salir");
 c=sc.next().charAt(0);//para leer un char desde el teclado
 }while(c!='s');
}
    }
