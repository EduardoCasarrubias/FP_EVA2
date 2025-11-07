/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA2_26_FACTORIAL {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        long factorial = 1;
        
         System.out.println("escriba un termino: ");
         num = captu.nextInt();
         
          if(num < 0){
               System.out.println("factorial de numeros negativos no esta definido");
          }else{
              for(int i = 1; i <= num; i++){
                  factorial = factorial * i;
              }
               System.out.println("el factorial de " + num + " es: " + factorial);
          }
    }
    
}
