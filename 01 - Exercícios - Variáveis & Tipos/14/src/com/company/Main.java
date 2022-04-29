package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double VALOR_DE_PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio em cm: ");

        double raioDoCirculo = scanner.nextFloat();

        double areaDoCirculo = VALOR_DE_PI * (Math.pow(raioDoCirculo, 2.0));

        System.out.printf("A area eh %.2f cm quadrados", areaDoCirculo);
    }
}
