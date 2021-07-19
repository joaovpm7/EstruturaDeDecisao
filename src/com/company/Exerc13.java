package com.company;

import java.util.Scanner;

public class Exerc13 {

    public static void main (String[] args){


        Scanner Scan = new Scanner(System.in);

        float alturaH;
        float alturaM;

        System.out.println("Somente homens, insira sua altura aqui: ");
        alturaH = Scan.nextFloat();

        double resultadoH = (72.7*alturaH) - 58;
        System.out.println("Seu peso: " + resultadoH);

        System.out.println("Somente mulheres, insira sua altura aqui: ");
        double resultadoM = (62.7


    }
}
