/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.resuelto;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EXAMENRESUELTO {

    
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
         int saldo= 5000;
         int calculo;
         int pin,opc,monto;
         System.out.println("introduce el pin: ");
         pin = captu.nextInt();
         
         
         if(pin == 1234){
             System.out.println("1.consutar saldo");
             System.out.println("2.retirar dinero");
             System.out.println("3.depositar dinero");
             System.out.println("seleccione la operacion");
             opc = captu.nextInt();
             if(opc==1){
                 System.out.println("tu saldo es " + saldo );
             }else if(opc==2){
                 System.out.println("¿cuanto vas a retirar?");
                 monto= captu.nextInt();
                 if(monto <=saldo){
                     calculo = saldo - monto;
                     System.out.println("tu saldo es" + calculo);
                 }else{
                     System.out.println("monto mayor al saldo");
                 }
             }else if(opc==3){
                 System.out.println("¿cuanto vas a depositar?");
                 monto= captu.nextInt();
                         if(monto>=0){
                             calculo = saldo + monto;
                             System.out.println("tu saldo es" + calculo);
                         }else{
                             System.out.println("monto negativo");
                         }
                 
             }
         }else{
             System.out.println("acceso denegado");
         }
    }
    
}
