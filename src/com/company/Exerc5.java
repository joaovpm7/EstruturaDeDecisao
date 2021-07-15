package com.company;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        float n1, n2, md;

        System.out.println("Digite sua primeira nota: ");
        n1 = Scan.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        n2 = Scan.nextFloat();

        md = (n1 + n2) / 2;

        if (md >= 7 & md < 10) {
            System.out.println("Aprovado!!!");
        } else if (md < 7 & md >= 0) {
            System.out.println("Reprovado!!!");
        } else if (md == 10){
            System.out.println("Aprovado com distinção!!!");
        }


    }

}