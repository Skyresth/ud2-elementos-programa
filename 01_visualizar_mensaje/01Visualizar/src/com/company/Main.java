package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pantalla
        System.out.print("Hello World:");
        // Teclado
        String mensaje = br.readLine();
        // PantallaRespuesta
        System.out.println("El mensaje es:"+mensaje);
    }
}
