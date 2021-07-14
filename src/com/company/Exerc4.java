package com.company;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {

        System.out.println("Introduza a letra: ");
        Scanner Scan = new Scanner(System.in);

        String a1 = Scan.next();
        char a2 = a1.charAt(0);

        System.out.println(a1);

        switch (a2) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("A letra " + a1 + " é uma vogal");
                break;
            default:
                System.out.println("A letra " + a1 + " é uma consoante");


        }


    }


}
