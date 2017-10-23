package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Dia[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println("Ingresa un numero");
        int d= sc.nextInt();
        if(d >= 1 && d <= 7){
            System.out.println("el dia "+d+" es "+Dia[d-1]);
        }else{
            System.out.println("No es un dia de la semana");
            // Asi me quito el problema de si no ponen entre el 1 y el 7, a menos que pongan letras...
        }
    }
}
