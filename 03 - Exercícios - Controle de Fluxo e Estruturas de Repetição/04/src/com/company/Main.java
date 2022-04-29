package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    int[] cincoNumeros = new int[5];

    int numeroTemporario;


    for (int i = 0; i < 5;i++){
        System.out.println("Entre um numero: ");
        cincoNumeros[i] = scanner.nextInt();
    }
    for(int i = 0; i < 5; i++){
        for (int j = i+1; j < 5; j++){
            if(cincoNumeros[i] < cincoNumeros[j]) {
                numeroTemporario = cincoNumeros[i];
                cincoNumeros[i] = cincoNumeros[j];
                cincoNumeros[j] = numeroTemporario;
            }
        }
    }
    System.out.println("Os numeros digitados em ordem decrescente: ");
    for(int i = 0; i < 5; i++){
        System.out.printf("%d ", cincoNumeros[i]);
    }
    }
}
