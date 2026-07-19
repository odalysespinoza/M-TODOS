/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Odalys Maily Espinoza Medina <your.name at your.org>
 */
public class Ejercicio10 {
    
    public static int mayor(int a, int b){
        
        if(a > b){
            return a;
        } else {
            return b;            
        }
 
    }
    
    public static void main(String[] args){
        
        int resultado = mayor(10, 7);
        
        System.out.println("El número mayor es: " + resultado);
    }
}
