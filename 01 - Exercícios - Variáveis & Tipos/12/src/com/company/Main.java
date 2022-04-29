package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o valor de custo do produto?");
    float valorDeCusto = scanner.nextFloat();
    System.out.println("Quantos por cento deve ser o lucro?");
    float porcentagemDeLucro = (scanner.nextFloat()/100) + 1;

    float valorDeVenda = valorDeCusto * porcentagemDeLucro;

    System.out.printf("O valor da venda eh igual a: R$ %.2f\n", valorDeVenda);
    }
}
