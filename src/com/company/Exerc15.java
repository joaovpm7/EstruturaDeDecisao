package com.company;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);

        float salarioH, horast;

        System.out.println("Quanto voce ganha por hora? ");
        salarioH = Scan.nextFloat();
        System.out.println("Quantas horas voce trabalha no mes? ");
        horast = Scan.nextFloat();

        // salario bruto.
        float salariot = salarioH * horast;
        System.out.println("Seu salario BRUTO total é de: R$" + salariot + " Reais. \n");

        // quanto pagou ao INSS.
        double inss = (8 / 100.0) * salariot;
        //quanto que pagou ao Sindicato.
        double sin = (5 / 100.0) * salariot;
        //ir
        double ir = (11 / 100.0) * salariot;

        // Valor dos impostos
        System.out.println("Valor dos impostos: INSS: R$ " + inss + " Reais\n" + "SIN: R$ " + sin + " Reais\n" + "IR: R$ " + ir + " Reais\n");


        //salario liquido
        float salarioL;

        double desc = inss + sin + ir;
        salarioL = (float) (salariot - desc);

        System.out.println("Salario liquido: R$" + salarioL + " Reais");


    }
}
