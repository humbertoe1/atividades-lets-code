package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    for(int i = numero-1; i > 0; i--){

        numero = numero*i;
    }
    System.out.printf("O Fatorial do numero digitado eh igual a: %d\n", numero);

    }
}
