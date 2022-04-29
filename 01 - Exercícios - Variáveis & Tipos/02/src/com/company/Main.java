package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Esse programa calcula quantos cavalos sao necessarios para levantar uma massa a uma certa altura em determinado tempo");
        System.out.println("Entre a massa: ");
        float massa = scanner.nextFloat();
        System.out.println("Entre a altura(em centimetros!): ");
        float altura = scanner.nextFloat();
        System.out.println("Entre o tempo(em segundos!): ");
        float tempo = scanner.nextFloat();

        float cavalos = (massa * altura / tempo )/745.699f;

        System.out.printf("Sao necessarios %.0f Cavalos!", cavalos);
    }
}
