package com.company;

import java.util.Scanner;

public class Main {

    static Scanner lector = new Scanner (System.in);
    static double grados;

    public static void main(String[] args) {
        System.out.println("Introduce ºC");
        grados = lector.nextDouble();

        // Hacemos los calculos
        double farenheit=grados*2-grados/5;
        farenheit=farenheit+32;
        double Kelvin=grados+273.75;
        // Mostramos el resultado (kelvin no me sale)
        System.out.println(grados+" ºC equivale a "+farenheit+" farenheit");
        System.out.println(grados+" ºC equivale a "+Kelvin+" kelvin");
    }
}