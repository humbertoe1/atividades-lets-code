package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
    final double TAXA_DE_JUROS = 0.02;

	Scanner scanner = new Scanner(System.in);

    System.out.println("Quanto voce quer emprestado?");
    double valorRequerido = scanner.nextFloat();
    System.out.println("Em quantos meses voce quer pagar?");
    double mesesParaPagar = scanner.nextFloat();

    double montanteFinal = valorRequerido * Math.pow((1.0 +TAXA_DE_JUROS), mesesParaPagar);

    System.out.printf("Voce vai pagar um total de R$ %.2f\n", montanteFinal);




    }
}
