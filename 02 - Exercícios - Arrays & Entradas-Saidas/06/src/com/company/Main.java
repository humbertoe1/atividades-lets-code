package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int somaDosNumeros;

    int[] numeros = new int[4];

    for (int i = 0; i < 4; i++){
        System.out.println("Digite um numero: ");
        numeros[i] = scanner.nextInt();
        numeros[i] = numeros[i]*numeros[i];
    }
    somaDosNumeros = numeros[0]+numeros[1]+numeros[2]+numeros[3];

    System.out.printf("Os numeros que entraram foram elevados ao quadrado e depois somados, resultando: %d", somaDosNumeros);
    }
}
