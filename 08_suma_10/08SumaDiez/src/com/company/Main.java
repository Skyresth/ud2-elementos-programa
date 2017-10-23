package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        { int suma=0;
            Scanner lector = new Scanner(System.in);
            for(int i=0;i<10;i++){
                System.out.print("Ingrese numero : ");
                int numero=lector.nextInt();
                suma=suma+numero;
            }
            System.out.println("La suma de los "+10+" numeros que ingreso es : "+suma);
        }
    }
}
// GG Easy