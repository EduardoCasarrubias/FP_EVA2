/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_10_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimir los numeros del 1 al 20
        Scanner captu = new Scanner (System.in);
        for(int i =1; i <=20; i++)
            System.out.print(i + "-");
            //imprimir los num de 0 al 100
            System.out.println("");
        for(int i =0; i <=100; i+=2)
                System.out.print(i +"-");
        for(int i = 100; i >=0; i-=2)
              System.out.print(i + "-");
        int num1, num2;
        System.out.println("seleccione dos valores: ");
        System.out.println("primer valor: ");
        num1 = captu.nextInt();
        System.out.println("segundo valor: ");
        num2 = captu.nextInt();
        
        if(num1 < num2){
        for(int i= num1; i<= num2; i++)
            System.out.println(i);
        }else if(num1> num2){ 
        for(int i= num1; i>= num2; i--)
            System.out.println(i);
       int num;
        System.out.println("Ingresa un numero del 1 al 10");
                num = captu.nextInt();
                for(int i = 1; i<=10; i++)
                    System.out.println(num + "x"+ i );
        
    }
    }
}
