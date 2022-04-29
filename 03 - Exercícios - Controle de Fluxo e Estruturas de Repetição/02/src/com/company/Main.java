package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um nomero inteiro para ver se eh positivo ou negativo: ");
    int numero = scanner.nextInt();
    while (numero != 0){
        if(numero > 0){
            System.out.println("Positivo!(+)");
        }else{
            System.out.println("Negativo!(-)");
        }
        System.out.println("Digite mais um numero: ");
        numero = scanner.nextInt();
    }

    }
}
