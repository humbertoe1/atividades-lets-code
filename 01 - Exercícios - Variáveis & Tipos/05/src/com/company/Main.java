package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Vamos ajustar seu salário!");
    System.out.println("Entre seu salário atual: ");

    float salario = scanner.nextFloat();
    System.out.printf("Seu salario sem o novo ajuste eh: R$ %.2f\nMas ajustando, seu novo salario eh: R$ %.2f", salario, salario*1.07);
    }
}
