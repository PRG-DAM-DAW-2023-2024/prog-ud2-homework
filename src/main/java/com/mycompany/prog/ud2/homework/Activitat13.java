/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog.ud2.homework;

/**
 *
 * @author batoi
 */
import java.util.Scanner;

public class Activitat13 {

    private static final double PI = 3.1415;

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Introdueix el valor del 'radi' d'un cercle: ");
        double radio = input.nextDouble();

        System.out.print("Ara introdueix el valor de la 'base' d'un triangle: ");
        double base = input.nextDouble();

        System.out.print("I finalment, la seua 'altura': ");
        double altura = input.nextDouble();

        double perimetroCirculo = 2 * PI * radio;
        double areaCirculo = PI * Math.pow(radio, 2);
        double areaTriangle = base * altura / 2;

        System.out.println("RESULTATS");
        System.out.println("---------");

        System.out.printf("Cercle: Perímetre -> %.2f Àrea -> %.2f\n", perimetroCirculo, areaCirculo);
        System.out.printf("Triangle: Àrea -> %.2f\n", areaTriangle);
    }
}
