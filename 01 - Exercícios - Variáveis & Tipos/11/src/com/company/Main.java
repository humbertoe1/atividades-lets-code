package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.println("Entre o valor da compra: ");
    float valorDaCompra = scanner.nextFloat();

    float valorDaPrestacao =  valorDaCompra/5.0f;

    System.out.printf("O valor total da compra foi: R$ %.2f\n", valorDaCompra);
    System.out.printf("Mas dividimos em 5x sem juros, ficando R$ %.2f por prestacao!\n", valorDaPrestacao);
    }
}
