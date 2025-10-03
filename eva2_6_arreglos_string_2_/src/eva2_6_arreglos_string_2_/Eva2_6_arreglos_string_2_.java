/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2_;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_6_arreglos_string_2_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu =new Scanner (System.in);
        int dia;
        String diasSemana[]= {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        System.out.println("introduce el dia de la semana:(0-6)  ");
        dia= captu.nextInt();
        System.out.println("el dia de la semana es: " +diasSemana[dia]);
    }
    
}
