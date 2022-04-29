package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        //abaixo temos um vetor multidimensional com 10 alunos
        //cada aluno tem 10 respostas.
        System.out.println("Entre o numero de alunos que farão a prova: ");
        int alunos = scanner.nextInt();

	char[][] vetorG = new char[alunos][10];

    int[] vetorAcertos = new int[alunos];

    char[] gabarito = new char[] {'A', 'B', 'B', 'A', 'C', 'B', 'C', 'C', 'A', 'C'};

        for(int i = 0; i < vetorG.length; i++){
            System.out.printf("Aluno %d\n", i+1);
            for(int j = 0; j < 10; j++){
                System.out.printf("Questão %d) Escolha: |A|B|C| : ", j+1);
                vetorG[i][j] = Character.toUpperCase(scanner.next().charAt(0));
                if(vetorG[i][j] == gabarito[j]){
                    vetorAcertos[i] = vetorAcertos[i] + 1;
                }
            }
        }
        for(int k = 0; k < vetorG.length; k++){
    System.out.printf("O aluno %d acertou %d questoes\n", k+1, vetorAcertos[k]);
    }
    }
}
