package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//o jeito que pensei de fazer essa questao inserido os 10 valores
        //em uma matriz, foi fazer uma matriz de 2 linhas e 5 colunas.
        //tambem poderia ser 5 linhas e 2 colunas
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][5];
        boolean existe = false;

        for (int i = 0; i< matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.printf("Insira um valor na posicao (%d, %d) da matriz: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entre um valor: ");
        int valor = scanner.nextInt();

        for (int i = 0; i< matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                if(valor == matrix[i][j]){
                    existe = true;
                }
            }
        }
        if(existe){
            System.out.println("O valor existe no conjunto");
        }else{
            System.out.println("--");
        }


    }
}
