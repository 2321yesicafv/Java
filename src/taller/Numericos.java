/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author SOPORTE
 */
public class Numericos {
  public static void main(String[] args) {
        Scanner Numericos = new Scanner(System.in);
        Integer Numero1;
        Integer Numero2;
        Integer Numero3;
        Integer Numero4;
        
      
        System.out.print("Ingrese Primer Numero: ");
        Numero1 = Numericos.nextInt();
        
        System.out.print("Ingrese Segundo Numero: ");
        Numero2 = Numericos.nextInt();
        
        System.out.print("Ingrese Tercer Numero: ");
        Numero3 = Numericos.nextInt();
        
        System.out.print("Ingrese Cuarto Numero: ");
        Numero4 = Numericos.nextInt();
        
    
        System.out.print("La suma de los numeros es: ");
        System.out.print(Numero1+Numero2+Numero3+Numero4);
    
        System.out.print("El producto de los numeros es: ");
        System.out.print(Numero1*Numero2*Numero3*Numero4);
        
        
          
}
}