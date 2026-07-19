/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Odalys Maily Espinoza Medina <your.name at your.org>
 */
public class Ejercicio6 {
    public static int obtenerNumero(){
        
        int numero = (int)(Math.random() * 100) + 1;
        return numero;
                
    }
     public static void main(String[] args){
         
         int resultado = obtenerNumero();
         
         System.out.println("Número aleatorio: " + resultado);
     }
}
