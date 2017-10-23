package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
     //Por alguna razón me pide (hay que escribir) dos numeros antes de pedir los numeros que multiplicará
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        int numero1 = Integer.parseInt(br.readLine());
        int numero2 = Integer.parseInt(br.readLine());
        try{
            System.out.println("Introduce el primer número:");
            numero1 = Integer.parseInt(br.readLine());
            System.out.println("Introduce el segundo número:");
            numero2 = Integer.parseInt(br.readLine());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        int resultado = numero1 * numero2;
        System.out.println("La multiplicación es " + numero1 + " x " + numero2 + " = " + resultado);
    }
}