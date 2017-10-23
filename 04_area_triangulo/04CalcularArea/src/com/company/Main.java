package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double b, h;
            System.out.println("Ingresa base");
            b = sc.nextDouble();
            System.out.println("Ingresa altura");
            h = sc.nextDouble();
            double area;
            area = b * h / 2;
            System.out.print(area);
        }
    }