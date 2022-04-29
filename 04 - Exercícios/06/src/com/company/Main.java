package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int[] gabarito = new int[] {7, 9, 11, 14, 24, 32, 33, 34, 48, 49, 55, 59, 60 };
	Scanner scanner = new Scanner(System.in);

    int[] acertos = new int[] {0, 0, 0};

    int[][] vetor = new int[3][13];

    System.out.println("Bem vindo a loteria 'CEM AZAR'!");
    System.out.println("Cada jogo tem 13 numeros!");
    System.out.println("Vamos jogar 3 vezes! NUMEROS DE 1 A 60!");

    for(int i = 0; i < vetor.length; i++){
        for(int j = 0; j< 13; j++){
            System.out.printf("Jogo %d Numero: %d: ",i+1, j+1);
            vetor[i][j] = scanner.nextInt();
            System.out.printf("\n");
        }
    }

    for(int i = 0; i< vetor.length; i++){
        for(int j = 0; j< 13; j++){
            for(int k = 0; k <13; k++){
                if (vetor[i][j] == gabarito[k]){
                    acertos[i]++;
                    break;
                }
            }
        }
    }
    int contador = 0;
    while(contador < 3){

        System.out.printf("O Jogador %d acertou %d vezes!", contador+1, acertos[contador]);
        contador++;
    }





    }
}
