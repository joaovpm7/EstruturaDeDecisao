package com.company;

import java.util.Scanner;

public class Exerc12 {

    public static void main (String[] args){

        Scanner Scan = new Scanner(System.in);

        float altura;

        System.out.println("Insira sua altura: ");
        altura = Scan.nextFloat();
        System.out.println("Sua altura informada foi: " + altura + " cm");

        double peso = (72.7 * altura) - 58;
        System.out.println("Seu peso é: " + peso);
    }
}
