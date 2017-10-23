package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, valor_absoluto ;
        System.out.println ( "Ingrese un número" ) ;
        Scanner entrada= new Scanner (System.in) ;

        num = entrada.nextInt() ;
        if (num >= 0) {
            System.out.println ( " El Valor Absoluto es "+ num);
        }

        valor_absoluto = (num * -1) ;
        if (num < 0) {

            System.out.println ( " El Valor Absoluto es "+ valor_absoluto);
        }


    }
}