/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_12_tabla_multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int num;
        
        System.out.println("Ingresa un numero");
                num = captu.nextInt();
                for(int i = 1; i<=10; i++)
                    
                    System.out.println(num + "x"+ i + "= " + (num*i));
    }
    
}
