/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_swicht;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_2_swicht {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opc;
        System.out.println("1.consutar saldo");
        System.out.println("2.retirar dinero");
        System.out.println("3.depositar dinero");
        System.out.println("selecciona una opccion del menu");
        opc = captu.nextInt();
        switch(opc){
            case 1:
                System.out.println("elegiste imprimir saldo");
                break;//rompe o detiene la instruccion
            case 2:
                System.out.println("elegiste retirar dinero");
                break;
            case 3: 
                System.out.println("elegiste deposistar dinero");
                break;
            default:
                System.out.println("opccion incorrecta");
            
        }
        
             
    }
    
}
