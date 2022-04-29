package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Vamos ler 10 valores inteiros positivos!");
    int[] numero = new int[10];
    int maior, menor, indexDoMaior = 0, indexDoMenor = 0;
    int somador = 0;
    double media;
    for (int i = 0; i < 10; i++){
        System.out.println("Digite um inteiro: ");
        numero[i] = scanner.nextInt();
    }
    maior = -1;
    menor = 0;
    for(int i = 0; i < 10; i++){

            if (numero[i] > maior) {
                maior = numero[i];
                indexDoMaior = i;
            }
            if(numero[i] < menor || menor == 0){
                menor = numero[i];
                indexDoMenor = i;
            }
            somador+=numero[i];
    }
    media = somador/10.0;

    System.out.printf("O maior eh %d!\nO menor eh %d!\nA media eh %.2f!\n", numero[indexDoMaior], numero[indexDoMenor], media);
    }
}
