package com.company;

import java.util.Scanner;

public class Exerc8 {

    public static void main (String[] args){

        Scanner Scan = new Scanner(System.in);

        float num1, num2, num3;

        System.out.println("Preço do produto um: ");
        num1 = Scan.nextFloat();
        System.out.println("Preço do produto dois: ");
        num2 = Scan.nextFloat();
        System.out.println("Preço do produto tres: ");
        num3 = Scan.nextFloat();

        if (num1 < num2 & num1 < num3){
            System.out.println("O pruduto um é mais barato!!! " + num1 + " reais");
        } else if (num2 < num1 & num2 < num3){
            System.out.println("O pruduto dois é mais barato!!! " + num2 + " reais");
        } else if (num3 < num1 & num3 < num2){
            System.out.println("O produto tres é mais barato!!! " + num3 + " reais");
        }








    }
}
