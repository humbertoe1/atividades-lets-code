package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite a terceira do aluno:");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3)/3.0f;

        System.out.printf("A media de %s eh igual a: %.2f\n", nome, media);


    }
}
