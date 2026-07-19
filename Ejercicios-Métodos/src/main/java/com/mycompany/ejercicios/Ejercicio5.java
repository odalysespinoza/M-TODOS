/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Odalys Maily Espinoza Medina <your.name at your.org>
 */
public class Ejercicio5 {
    public static void operaciones(double a, double b){
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        
        if (b != 0){
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("No se puede dividir para cero.");
        }
    }
    public static void main(String[] args){
        
        operaciones(8, 4);
    }
}
