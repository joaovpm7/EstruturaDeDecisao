package com.company;


import java.util.Scanner;

public class Exerc9 {

    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);


        float num1;
        float num2;
        float num3;

        System.out.println("Ensira o primeiro numero: ");
        num1 = Scan.nextFloat();
        System.out.println("Ensira o segundo numero: ");
        num2 = Scan.nextFloat();
        System.out.println("Ensira o terceiro numero: ");
        num3 = Scan.nextFloat();

        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("A ordem decrescente é: "+num1+" - "+num2+" - "+num3); //1, 2, 3
        } else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
            System.out.println("A ordem decrescente é: "+num1+" - "+num3+" - "+num2); //1, 3, 2
        } else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println("A ordem decrescente é: "+num2+" - "+num1+" - "+num3); //2, 1, 3
        } else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
            System.out.println("A ordem decrescente é: "+num2+" - "+num3+" - "+num1); //2, 3, 1
        } else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
            System.out.println("A ordem decrescente é: "+num3+" - "+num1+" - "+num2); //3, 1, 2
        } else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
            System.out.println("A ordem decrescente é: "+num3+" - "+num2+" - "+num1); //3, 2, 1
        }


    }
}
