/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do._while;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_19_do_while {
    final static String USUARIO = "admin" ;
    final static String PWD = "admin";
    public static void main(String[] args) {
        //1.pedimos datos de acceso
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //2.validamos
        //incorrecto ->> volver a preguntar
        //correcto ->>acceso de entrada
        do{
        System.out.println("usuario: ");
        usu = captu.nextLine();
        System.out.println("contraseña: ");
        contra= captu.nextLine();
        }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
        System.out.println("acceso concedido. BIENVENIDO AL SISTEMA");
       /* if(usu.equals(USUARIO) && contra.equals(PWD))
            System.out.println("acceso concedido. BIENVENIDO AL SISTEMA");
        else 
            System.out.println("acceso dengado");*/
        
        
    }
    
}
