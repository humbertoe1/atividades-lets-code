package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        int valor = scanner.nextInt();

        nota100 = valor/100;
        valor -= nota100*100;
        nota50 = valor/50;
        valor -= nota50*50;
        nota20 = valor/20;
        valor -= nota20*20;
        nota10 = valor/10;
        valor -= nota10*10;
        nota5 = valor/5;
        valor -= nota5*5;
        nota2 = valor/2;
        valor -= nota2*2;
        nota1 = valor;

        System.out.println(nota100 + " notas de 100");
        System.out.println(nota50 + " notas de 50");
        System.out.println(nota20 + " notas de 20");
        System.out.println(nota10 + " notas de 10");
        System.out.println(nota5 + " notas de 5");
        System.out.println(nota2 + " notas de 2");
        System.out.println(nota1 + " notas de 1");
    }
}
