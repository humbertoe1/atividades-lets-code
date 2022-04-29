package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Quantos KM o carro andou?");
    float kilometros = scanner.nextFloat();
    System.out.println("Quantos Litros o carro consumiu?");
    float litros = scanner.nextFloat();

    float consumoMedio = kilometros/litros;

    System.out.printf("O carro consegue fazer %.2f kilometros por litro!", consumoMedio);


    }
}
