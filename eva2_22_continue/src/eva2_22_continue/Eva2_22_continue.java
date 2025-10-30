/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author ecasa
 */
public class Eva2_22_continue {

    
    public static void main(String[] args) {
        //imprimir num pares
        int i = 0;
        while(i < 100){
            int resi = i % 2;
            if(resi != 0){//divisible entre dos 
                i++;
                continue;//interrumpe ciclo actual y continua con el sig 
        }
            System.out.print(i +"-");
            i++;
        }
        
    }
}
    

