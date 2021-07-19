package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args){

        Scanner Scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Insira dois numeros inteiros e um numero real!");

        System.out.println("Insira o primeiro numero inteiro: ");
        num1 = Scan.nextInt();
        System.out.println("Insira o segundo um numero inteiro: ");
        num2 = Scan.nextInt();
        System.out.println("Insira um numero real: ");
        num3 = Scan.nextInt();

        System.out.println("Questão 1: O produto do dobro do primeiro com metade do segundo.");
        System.out.println("Resposta: " + num1 * 2 * num2 / 2);

        int resultado = num1 * 3 + num3;
        System.out.println("Questão 2: A soma do triplo do primeiro com o terceiro.");
        System.out.println("Resposta: " + resultado);

        int resultado2 = (int) Math.pow(10,3);
        System.out.println("Questão 3: O terceiro elevado ao cubo.");
        System.out.println("Resposta: " + resultado2);





    }
}
