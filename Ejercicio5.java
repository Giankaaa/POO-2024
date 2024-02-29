
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejercicio5;


public class Ejercicio5 {
    public static void main(String[] args) {
        double  Suma, X, Y;
        Suma = 0;
        X = 20;
        Suma = Suma + X;
        Y = 40;
        X = X + Math.pow(Y,2);
        Suma = Suma + (X/Y);
        System.out.println("El valor de la suma es:" + Suma);
    }
}

