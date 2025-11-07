/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contraseña_for;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class Eva2_29_contraseña_for {
    final static String USUARIO = "eduardo";
    final static String PWD = "1234";
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String usu, pwd;
        boolean accesoCorrecto = false;//banderas
        for(int i = 1; i <= 4; i++){
             System.out.println("usuario: ");
             usu = captu.nextLine();
              System.out.println("contraseña: ");
              pwd = captu.nextLine();
              if(usu.equals(USUARIO) && pwd.equals(PWD)){
                  accesoCorrecto = true;
                  break;
              }
                  
        }
        if(accesoCorrecto)
                 System.out.println("ACCESO CONCEDIDO");
        else
             System.out.println("ACCESO DENEGADO");
    }
    
}
