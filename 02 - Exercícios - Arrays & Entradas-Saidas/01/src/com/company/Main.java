package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do aluno: ");
    String nome = scanner.nextLine();
    System.out.println("Digite a turma (A entrada deve ser uma letra!");
    char turma = scanner.next().charAt(0);
    System.out.println("Digite a primeira nota: ");
    float nota1 = scanner.nextFloat();
    System.out.println("Digite a segunda nota: ");
    float nota2 = scanner.nextFloat();
    System.out.println("Digite a terceira nota: ");
    float nota3 = scanner.nextFloat();
    float media = (nota1 + nota2 + nota3)/3;

    System.out.printf("A media do aluno %s da turma '%c' eh igual a %.2f!", nome, turma, media);



    }
}
