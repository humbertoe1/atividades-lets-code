package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	String nome = "nome";
    int idade = 0;
    float salario = 0.0f;
    char sexo = 'm';
    char estadoCivil = 's';
    boolean validador = false;
    while(!validador) {
        System.out.println("Escreva o seu nome: ");
        nome = scanner.nextLine();
        if (nome.length() < 4){
            System.out.println("O nome precisa ter mais que 3 letras!!");
        }else{
            validador = true;
        }
    }
    validador = false;
        while(!validador) {
            System.out.println("Escreva a sua idade: ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("A idade precisa ter entra 0 e 150 anos!");
            }else{
                validador = true;
            }
        }
        validador = false;
        while(!validador) {
            System.out.println("Agora seu Salario: ");
            salario = scanner.nextFloat();
            if (salario <= 0){
                System.out.println("O salario precisa ser maior que ZERO!");
            }else{
                validador = true;
            }
        }
        validador = false;
        while(!validador) {
            System.out.println("Agora digite seu sexo (m ou f): ");
            sexo = scanner.next().charAt(0);
            if (sexo != 'm' && sexo != 'f'){
                System.out.println("O sexo precisa ser 'm' ou 'f'!");
            }else{
                validador = true;
            }
        }
        validador = false;
        while(!validador) {
            System.out.println("Agora digite seu Estado civil (s, c, v OU d): ");
            estadoCivil = scanner.next().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
                System.out.println("O estado civil precisa ser 's', 'c', 'v' ou 'd'!");
            }else{
                validador = true;
            }
        }

        System.out.println("Em resumo:");
        System.out.printf("Nome: %s\nIdade: %d\nSalario: R$ %.2f\nSexo: %s\nEstado Civil: %s", nome, idade, salario, sexo, estadoCivil);
    }
}
