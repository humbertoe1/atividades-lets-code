package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um numero: ");
    float numero01 = scanner.nextFloat();
    System.out.println("Digite mais um numero: ");
    float numero02 = scanner.nextFloat();

    System.out.printf("A soma desses dois numeros eh: %f\n", numero01+numero02);
    System.out.printf("A subtracao desses dois numeros eh: %f\n", numero01-numero02);
    System.out.printf("A multiplicacao desses dois numeros eh: %f\n", numero01*numero02);
    System.out.printf("A divisao desses dois numeros eh: %f\n", numero01/numero02);

    }
}
