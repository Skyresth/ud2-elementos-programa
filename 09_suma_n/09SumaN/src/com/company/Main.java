package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        { int suma=0;
            Scanner lector = new Scanner(System.in);
            // Para aclarar la interfaz
            System.out.println("Programa para calcular la suma de n numeros");
            System.out.println("por favor dijite la cantidad de numeros que quiere sumar");
            int n= lector.nextInt();
            for(int i=0;i<n;i++){
                System.out.print("Ingrese numero : ");
                int numero=lector.nextInt();
                suma=suma+numero;
            }
            System.out.println("La suma de los "+n+" numeros que ingreso es : "+suma);
        }
    }
}
// GG Easy, copia del suma 10