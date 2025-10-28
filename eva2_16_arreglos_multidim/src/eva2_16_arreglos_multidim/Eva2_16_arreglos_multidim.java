/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos_multidim;

/**
 *
 * @author ecasa
 */
public class Eva2_16_arreglos_multidim {

    
    public static void main(String[] args) {
        int matriz [][] = new int [3][4];
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        
        //ciclo anidado
        for(int i = 0; i < matriz.length; i++){ //filas
            for(int j = 0; j < matriz[i].length; j++){ //columnas 
                matriz[i][j] =(int) (Math.random() * 100);
                
            }
        }
        for(int i = 0; i < matriz.length; i++){ //filas
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println("");
            }
    }
    
}
