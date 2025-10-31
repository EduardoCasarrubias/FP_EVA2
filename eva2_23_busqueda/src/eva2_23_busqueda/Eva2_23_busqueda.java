/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_23_busqueda {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor, posi = -1;//-1 significa que no lo encontramos 
        int dato[] = new int [10];
        
        for (int i = 0; i < dato.length; i++) {
            dato[i] = (int) (Math.random() * 100); 
            
            }
        for (int i = 0; i < dato.length; i++) {
            System.out.print("[" + dato[i] + "]");
        }
         System.out.println("");
          System.out.println("valor a buscar: ");
          valor = captu.nextInt();
          //busqueda lineal
          
          for (int i = 0; i < dato.length; i++) {
            if(valor == dato[i]){//lo encontramos 
                posi = i; //regresemas  donde lo encontramos
                break;//ya lo encontraste, detengo la busqueda                
            }            
          }
          System.out.println("posiscion: " + posi);
    }
    
}
