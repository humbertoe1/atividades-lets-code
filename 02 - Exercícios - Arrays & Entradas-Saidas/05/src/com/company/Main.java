package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de horas: ");
    float horas = scanner.nextFloat();
    System.out.println("Digite a velocidade por hora: ");
    float velocidadePorHora = scanner.nextFloat();

    float distancia = horas*velocidadePorHora;
    float litrosUsados = distancia/12;
    System.out.printf("Essa viagem precisara de %.2f litros de gasolia!", litrosUsados);


    }
}
