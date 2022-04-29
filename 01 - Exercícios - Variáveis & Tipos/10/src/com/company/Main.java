package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quanto quer depositar e veja quanto renderea em 1 mes: ");
        float valorDepositado = scanner.nextFloat()*1.007f;
        System.out.printf("Após 1 mes voce tera: R$ %.2f\n", valorDepositado);







    }
}
