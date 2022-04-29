package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[10];
        int contadorMaisQue18 = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite uma idade: ");
            idade[i] = scanner.nextInt();
            if(idade[i] > 18)
                contadorMaisQue18++;
        }
        System.out.printf("Temos %d pessoas com mais de 18 anos", contadorMaisQue18);



    }
}
