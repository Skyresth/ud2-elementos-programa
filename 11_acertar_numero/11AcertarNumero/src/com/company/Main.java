package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio = r.nextInt(100);

        String respuesta = "";
        int n=0;
        do{
        System.out.print("Escribe: ");
            respuesta = br.readLine();
        // Interger no me funciona por alguna razón. //
            if (!respuesta.equals("FIN")) {
                n = Integer.parseInt(respuesta);

            //Comprobacion de la respuesta
                if( n == aleatorio) {
                    System.out.println("Enhorabuena!!");
                } else if (n > aleatorio) {
                    System.out.println("Te has pasado.");
                } else {
                    System.out.println("Un poco mas");
                }
            }

        } while (!respuesta.equals("FIN") && n != aleatorio);

}
}