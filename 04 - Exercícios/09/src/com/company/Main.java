package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int[][] matrix = new int[3][5];
    int[] somaLinhas = new int[3];
    int[] somaColunas = new int[5];
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j< matrix[i].length; j++){
            System.out.printf("Preencha a posicao (%d, %d)", i, j);
            matrix[i][j] = scanner.nextInt();

        }
    }
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j< matrix[i].length; j++){
            somaLinhas[i] = somaLinhas[i]+matrix[i][j];
        }
    }

    for(int j = 0; j < matrix[0].length; j++){
        for(int i = 0; i < matrix.length; i++){
            somaColunas[j] = somaColunas[j] + matrix[i][j];
        }
    }

    for(int i = 0; i < somaLinhas.length;i++){
        System.out.printf("A soma da lihna %d eh igual a %d\n", i, somaLinhas[i]);
    }
    for(int i = 0; i < somaColunas.length; i++){
        System.out.printf("A soma da coluna %d eh igual a %d\n",i, somaColunas[i]);
    }
    System.out.println("Matriz completa para vizualização: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(j == 0) {
                    System.out.printf("%d ", matrix[i][j]);
                }else if(j == (matrix[i].length -1)){
                    System.out.printf(" %d\n", matrix[i][j]);
                }else{
                    System.out.printf(" %d ", matrix[i][j]);
                }
            }
        }


    }
}
