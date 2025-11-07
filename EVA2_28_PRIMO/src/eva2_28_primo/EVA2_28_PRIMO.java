/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA2_28_PRIMO {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int val;
        boolean esPrimo = true;
        System.out.println("introduce un valor: ");
        val = captu.nextInt();
        
        for(int i = 2; i < val; i++){
            //dividir(exacta)
            int residuo = val % i;
            if (residuo ==0){//ya no es primo
                esPrimo = false;
                break;
            }
            
            //una division exacta ya no es primo
        }
        if(esPrimo)
        System.out.println("el valor " + "es primo");
        else
       System.out.println("no es primo");
    }  
}
