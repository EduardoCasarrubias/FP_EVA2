/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_pirámide;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA2_25_PIRÁMIDE {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int n;
        
        System.out.println("introduce un valor: ");
        n = captu.nextInt();
        
        for(int i = 1; i <=n; i++){
            for(int e = 1; e <= i; e++){  
                System.out.print("*");   
            }
            System.out.println("");
        }
        for(int l = n; l >= 1; l--){
            for(int h = 1; h <= l ; h++){
                System.out.print("*");  
            }
            System.out.println("");
        }    
    }
    
}
