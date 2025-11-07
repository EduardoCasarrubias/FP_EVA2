/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA2_27_CUENTA {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int cuenta = 1000000, retiro;
        System.out.println("saldo inicial:" + cuenta);  
        
        for(;cuenta >= 0;){
            System.out.println("ingrese la cantidad a retirar: ");
            retiro = captu.nextInt();
            cuenta = cuenta - retiro;
        }
        for(;cuenta <= 0;){
            System.out.println("tu cuenta esta en ceros ya no puedes retirar");
        }
        
    }
    //hecho por mi
}
