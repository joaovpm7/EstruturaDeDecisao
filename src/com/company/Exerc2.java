package com.company;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe um valor");
        double num1 = Scan.nextDouble();
        if (num1 < 0) {
            System.out.println("O valor é negativo ");
        }
        if (num1 > 0) {
            System.out.println("O valor é positivo ");
        }


    }
}

