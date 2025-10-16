/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_14_captura {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int tama;
        System.out.println("cuantas calificaciones necesitas: ");
        tama = captu.nextInt();
        
        int califas[] = new int [tama];
        //capturar
        for(int i = 0; i < califas.length; i++){
            System.out.println("calificacion: " + (i+1) + ":");
            califas[i]= captu.nextInt();
        
    }
        //leer
        for(int i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]");
             
    }
        int suma = 0 ;
        //sumar todas las calificaciones 
        for(int i = 0; i < califas.length; i++){
           suma += califas[i];
        }
        double promedio = suma / (double)tama; //dividiendo enteros 
            System.out.println("promedio = " + promedio);
    }
}
