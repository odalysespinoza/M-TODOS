/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Odalys Maily Espinoza Medina <your.name at your.org>
 */
public class Ejercicio11 {
    
    public static boolean esPar(int numero){
        
        return numero % 2 == 0;
        
    }
    
    public static void main(String[] args){
        
        int numero = 8;
        
        if (esPar(numero)){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
