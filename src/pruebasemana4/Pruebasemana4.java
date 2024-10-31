/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasemana4;

import java.util.Scanner;

/**
 *
 * @author Maria Gabriela
 */
public class Pruebasemana4 {

    public static void main(String[] args) {
   
        Scanner entrada= new Scanner(System.in);
        int nproductos;
        
        nproductos=entrada.nextInt();
        char[] productos;
        productos = new char[nproductos];
       
        System.out.println("Ingrese el precio de cada producto");

        
        for (int i = 0; i < nproductos; i++) {
            System.out.println("Ingresar el preio del producto:");
            productos[i]=entrada.next().charAt(0);
            }
        for (int i = 0; i < nproductos; i++) {
            
        System.out.println("La suma de precios de los productos comprados es:"+productos[i]);

        } 
        
    }
    
}
