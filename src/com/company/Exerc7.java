package com.company;

import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        float num1, num2, num3, maior, menor;

        System.out.println("Digite o primeiro numero: ");
        num1 = Scan.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = Scan.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = Scan.nextFloat();

        maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("Maior: " + maior);

        menor = num1;

        if (num2 < menor){
            menor = num2;
        } if (num3 < menor){
            menor = num3;
        }
        System.out.println("Menor: "+menor);




    }
}
