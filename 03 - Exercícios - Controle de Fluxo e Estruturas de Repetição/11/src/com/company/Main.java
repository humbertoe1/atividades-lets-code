package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    int inteiroMaior, inteiroMenor;
    int inteiroTemporario;

    System.out.println("Digite um inteiro: ");
    inteiroMaior = scanner.nextInt();
    System.out.println("Agora outro: ");
    inteiroMenor = scanner.nextInt();

    if (inteiroMaior < inteiroMenor){
        inteiroTemporario = inteiroMenor;
        inteiroMenor = inteiroMaior;
        inteiroMaior = inteiroTemporario;
    }

    for(int i = inteiroMenor+1; i < inteiroMaior; i++){
        System.out.println(i);
        }

    }
}
