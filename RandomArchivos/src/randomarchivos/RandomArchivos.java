/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class RandomArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        //escribir
        File fichero=new File("D:\\bibliotecas\\Grado Superior Segundo\\Java\\random.txt");
        RandomAccessFile aleatorio= new RandomAccessFile (fichero,"rw");
        String apellido[]={"LOPEZ","FERNANDEZ","DURCAL","GONZALEZ","PARRA","PEREZ"};
        int departamento[]={12,25,20,15,14,41};
        double salario[]={1200,800,1500,2000,750,450};
        StringBuffer buffer=null;
        int n=apellido.length;
        
        for(int i=0;i<n;i++){
            aleatorio.writeInt(i+1);
            buffer=new StringBuffer(apellido[i]);
            buffer.setLength(10);
            aleatorio.writeChars(buffer.toString());
            aleatorio.writeInt(departamento[i]);
            aleatorio.writeDouble(salario[i]);
        }
        aleatorio.close();
        
        //leer
        
        File fichero2=new File("D:\\bibliotecas\\Grado Superior Segundo\\Java\\random.txt");
        RandomAccessFile aleatorio2= new RandomAccessFile (fichero,"r");
        
        int id,dep,posicion;
        Double salario2;
        char apellido2[]=new char[10];
        posicion=0;
        
        System.out.println("ESTOS SON LOS EMPLEADOS DE LA BASE DE DATOS");
        do{
            aleatorio2.seek(posicion);
            id=aleatorio2.readInt();
            for(int i=0; i<apellido2.length; i++){
                apellido2[i]=aleatorio2.readChar();
            }
            String apellidoS=new String(apellido2);
            dep=aleatorio2.readInt();
            salario2=aleatorio2.readDouble();
            
            System.out.println(" ID:"+id +" Apellido:"+apellidoS +" Departamento:" +dep +" Salario:" +salario2);
            posicion=posicion+36;
            } while(aleatorio2.getFilePointer()!=aleatorio2.length());
        
        aleatorio2.close();
        
       
        int captura;
        Scanner sc = new Scanner(System.in);
        posicion=0;
        System.out.println("\nElige el Id de la persona que quieres mostrar:");
        captura = sc.nextInt();
        if(captura==1)
            posicion=posicion;
        if(captura==2)
            posicion=posicion+36;
        if(captura==3)
            posicion=posicion+72;
        if(captura==4)
            posicion=posicion+108;
        if(captura==5)
            posicion=posicion+104;
        if(captura==6)
            posicion=posicion+180;
        //posicion=captura*36+posicion
        
        File fichero3=new File("D:\\bibliotecas\\Grado Superior Segundo\\Java\\random.txt");
        RandomAccessFile aleatorio3= new RandomAccessFile (fichero,"r");
        
        int id3,dep3;
        Double salario3;
        char apellido3[]=new char[10];
        
        
        
       
            aleatorio3.seek(posicion);
            id3=aleatorio3.readInt();
            for(int i=0; i<apellido3.length; i++){
                apellido3[i]=aleatorio3.readChar();
            }
            String apellidoS3=new String(apellido3);
            dep3=aleatorio3.readInt();
            salario3=aleatorio3.readDouble();
            
            System.out.println(" ID:"+id3 +" Apellido:"+apellidoS3 +" Departamento:" +dep3 +" Salario:" +salario3);
            
            
        aleatorio3.close();
     
        
        
        
        
    }
    
}
