/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;


public class Ejercicio17 {

    public static void main(String[] args) {
        double Radio, Area_circulo, Perimetro_circunferencia;
        Radio = 10;
        Area_circulo = Math.PI*Math.pow(Radio,2); 
        Perimetro_circunferencia = 2*Math.PI*Radio;      
        System.out.println("El valor del radio es: " + Radio);
        System.out.println("El valor del Área del cÍrculo es : " + Area_circulo);
        System.out.println("El valor del perÍmetro de la circunferencia es : " + Perimetro_circunferencia);
    }
}
