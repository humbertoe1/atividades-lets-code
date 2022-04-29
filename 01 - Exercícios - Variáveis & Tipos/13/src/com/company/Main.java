package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o custo de Fabrica: ");
    float custoDeFabrica = scanner.nextFloat();
    float impostos = custoDeFabrica* 0.45f;
    float porcentagemDoDistribuidor = custoDeFabrica*0.28f;

    float custoAoConsumidorFinal = custoDeFabrica + impostos + porcentagemDoDistribuidor;

    System.out.printf("O custo final desse carro eh: R$ %.2f", custoAoConsumidorFinal);

    }
}
