package com.company;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        float num1, num2, num3;

        System.out.println("Digite o primeiro numero: ");
        num1 = Scan.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = Scan.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = Scan.nextFloat();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O numero um é maior: "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O numero dois é maior: "+num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O numero tres é maior: "+num3);
        }





    }
}
