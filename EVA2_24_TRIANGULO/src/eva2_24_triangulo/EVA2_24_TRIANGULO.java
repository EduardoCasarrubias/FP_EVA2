/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA2_24_TRIANGULO {

    
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
    }
    
}
