package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	double[][] valoresNaMatriz = new double[2][5];

    for (int i = 0; i < 2; i++){
        for(int j = 0; j < 5; j++){
            System.out.println("Digite um valor: ");
            valoresNaMatriz[i][j] = scanner.nextDouble();
        }
    }
    System.out.println("Todos os valores da Matriz e suas posições: ");
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("(%d, %d) = %.2f\n", i, j, valoresNaMatriz[i][j]);
            }
        }


    }
}
