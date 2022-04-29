package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int dias =  idade*365;

        System.out.printf("Voce vivei aproximadamente %d dias", dias);
    }
}
