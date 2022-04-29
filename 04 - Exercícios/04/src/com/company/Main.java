package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos elementos vc vai digitar: ");
    int tamanho = scanner.nextInt();

    int[] matrizDeInteiros = new int[tamanho];

    for (int i = 0; i < matrizDeInteiros.length; i++){
        System.out.println("Digite um valor: ");
        matrizDeInteiros[i] = scanner.nextInt();
    }

    int soma = somaDeTodos(matrizDeInteiros);

    System.out.printf("A soma de todos os elementos da array eh: %d", soma);
    }

    public static int somaDeTodos(int[] matrizInteiros){
        int soma = 0;
        for (int i = 0; i < matrizInteiros.length; i++){
            soma+= matrizInteiros[i];
        }
        return soma;
    }
}
