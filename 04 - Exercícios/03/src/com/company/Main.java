package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrizDeDouble = new double[2][5];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Digite um valor: ");
                matrizDeDouble[i][j] = scanner.nextDouble();
            }
        }
        double grandeValor = acharMaiorValor(matrizDeDouble);
        System.out.printf("O maior valor eh %.2f", grandeValor);
    }
    public static double acharMaiorValor (double[][] matrizDouble){
        double maiorValor = matrizDouble[0][0];

        for(int i = 0; i < matrizDouble.length; i++){
            for(int j = 0; j < matrizDouble[0].length; j++){
                if(matrizDouble[i][j] > maiorValor){
                    maiorValor = matrizDouble[i][j];
                }
            }
        }
        return maiorValor;
    }
}


