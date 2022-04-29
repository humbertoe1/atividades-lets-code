package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva a quantidade de cavalos no Haras: ");
    int cavalos = scanner.nextInt();

    int ferraduras = cavalos*4;

    System.out.printf("A quantidade de ferraduras necessarios eh: %d", ferraduras);





    }
}
