package com.company;

import java.util.Scanner;

public class Exerc13 {

    public static void main (String[] args){

        Scanner Scan = new Scanner(System.in);

        int genero;
        System.out.println("Digite seu sexo: [1] para homem e [2] para mulher.");
        genero = Scan.nextInt();

        if (genero == 1){
            double home;
            double alturah;
            System.out.println("Digite sua altura: ");
            alturah = Scan.nextDouble();
            home = (72.7 * alturah) - 58;
            System.out.println("Seu peso ideal é: " + home + " quilos");

        } else if (genero ==2){
            double mulher;
            double alturam;
            System.out.println("Digite sua altura: ");
            alturam = Scan.nextDouble();
            mulher = (62.1 * alturam) - 44.7;
            System.out.println("Seu peso ideal é: " + mulher + " quilos");
        }



    }
}
