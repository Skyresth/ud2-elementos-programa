package com.company;

import java.util.Scanner;

public class Main {
// Hay comandos que no entiendo y he mirado en páginas de programación como Scanner y numero.nextInt//
    public static void main(String[] args) {
        int num[] = new int[3];
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = numero.nextInt();
        }
        System.out.println("Imprimiendo orden inverso.");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("Indice  " + i + " =" + num[i]);
        }
    }
}