package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas, colunas, linhaEscolhida;
        System.out.println("Quantidade de linhas: ");
        linhas = scanner.nextInt();
        System.out.println("Quantidade de colunas: ");
        colunas = scanner.nextInt();
	    int[][] matrix = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Vamos preencher a posicao: (%d, %d): \n", i+1, j+1);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("Essa matriz tem %d linhas. Digite uma linha para calcular os valores dela: ", linhas);
        //O valor abaixo é '-1' por que, por exemplo, uma matriz com 5 linhas, tem as linhas: 0/1/2/3/4.
        //Se o usuario quiser a linha 1, essa será a linha 1-1, ou seja, a 0. se ele quiser a linha 4, essa sera a 4-1, ou seja a 3.
        //a mesma lógica se aplica para todas as linhas.
        linhaEscolhida = scanner.nextInt() - 1;

        double resultado = mediaDaLinha(matrix, linhaEscolhida);

        System.out.printf("A media da soma dos elementos da linha %d eh: %.2f",linhaEscolhida+1, resultado);

    }
    public static double mediaDaLinha(int[][] matrizBiInteiros, int numeroDaLinha){
        int soma = 0;

        for(int i = 0; i < matrizBiInteiros[numeroDaLinha].length; i++){
            soma+=matrizBiInteiros[numeroDaLinha][i];
        }
        double media = soma/matrizBiInteiros[numeroDaLinha].length;
        return media;
    }
}
