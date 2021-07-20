package com.company;

import java.util.Scanner;

public class Exerc14 {

    public static void main (String[] args){


        Scanner Scan = new Scanner(System.in);

        int pesoLimite = 50;

        int peso;
        System.out.println("Digite aqui o peso dos pexeis: ");
        peso = Scan.nextInt();
        System.out.println("O peso dos peixeis é: " + peso + " quilos");

        if (peso > 50){
            System.out.println("Voce excedeu o teto maximo, 50 quilos. Portanto, voce pagará 4,00 reais de multa por quilo excedente.\n");

            double excesso, multa;
            excesso = peso - pesoLimite;
            multa = excesso * 4.00;
            System.out.println("Quilos em peixe excedido: " + excesso + " quilos a mais.\n");
            System.out.println("A sua multa foi de: " + multa + " Reais.");


        }



    }
}
