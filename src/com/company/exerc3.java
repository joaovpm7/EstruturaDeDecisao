package com.company;

import java.util.Scanner;

public class exerc3 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        char sexo;

        System.out.println("Digite seu texto aqui: ");
        sexo = Scan.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        switch (sexo) {
            case 'F' -> System.out.println("Feminino");
            case 'M' -> System.out.println("Masculino");
            default -> System.out.println("Indefinido");
        }


    }
}
