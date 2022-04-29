package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	double[] valoresAleatorios = new double[10];

        Random valorAleatorio = new Random();
        for(int i = 0; i < 10;i++) {
            valoresAleatorios[i] = valorAleatorio.nextDouble() * 100;
            System.out.printf("%.2f\n", valoresAleatorios[i]);
        }



    }
}
