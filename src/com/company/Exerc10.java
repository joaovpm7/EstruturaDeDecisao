package com.company;
import java.util.Scanner;
public class Exerc10 {

    public static void main (String[] args){

        Scanner Scan = new Scanner(System.in);

        String turno;

        System.out.println("Qual turno voce estuda? ");
        turno = Scan.next();

        switch (turno) {
            case "Matutino" -> System.out.println("Bom dia!!!");
            case "matutino" -> System.out.println("Bom dia!!!");
            case "m" -> System.out.println("Bom dia!!!");
            case "M" -> System.out.println("Bom dia!!!");
            case "Vespertino" -> System.out.println("Boa tarde!!!");
            case "vespertino" -> System.out.println("Boa tarde!!!");
            case "V" -> System.out.println("Bom dia!!!");
            case "v" -> System.out.println("Bom dia!!!");
            case "Noturno" -> System.out.println("Boa noite!!!");
            case "N" -> System.out.println("Bom dia!!!");
            case "n" -> System.out.println("Bom dia!!!");
            case "noturno" -> System.out.println("Boa noite!!!");
            default -> System.out.println("Indefinido");
        }



    }
}
