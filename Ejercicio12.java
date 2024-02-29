/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;


public class Ejercicio12 {

    public static void main(String[] args) {
        double Valor_Hora, Salario_Neto, Valor_Reten;
        double Salario_Bruto, Porcentaje_Reten, Horas_trab;
        Horas_trab = 48;
        Valor_Hora = 5000;
        Salario_Bruto = Horas_trab*Valor_Hora;
        Porcentaje_Reten = 12.5/100;
        Valor_Reten = Salario_Bruto*Porcentaje_Reten;
        Salario_Neto = Salario_Bruto - Valor_Reten;
        System.out.println("El salario Bruto es: " + Salario_Bruto);
        System.out.println("El valor de retención de la fuente es: " + Valor_Reten);
        System.out.println("El salario Neto es: " + Salario_Neto);
    }
}
