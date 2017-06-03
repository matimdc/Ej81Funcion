/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej81funcion;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej81Funcion {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System. in);
        System. out. println ("Escrir el dividendo: ");
         int dividendo = teclado.nextInt();
         System. out. println ("Escriba el divisor: ");
       int divisor = teclado.nextInt();
        System.out.println("el resto de la division es: " + funcionResto(dividendo , divisor));
         System.out.println("con la funcion modulo  : " + (dividendo % divisor));
    }
 
    public static int funcionResto (int dividendo ,  int divisor){
    int cociente;
    
     cociente = dividendo / divisor;
    
  return (dividendo-(divisor *  cociente));     
        
    }
}
