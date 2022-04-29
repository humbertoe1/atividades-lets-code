package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double[] notas = new double[4];
    Scanner scanner = new Scanner(System.in);

    for(int i = 0; i < 4; i++){
        System.out.printf("Digite a %dº nota: ", i+1);
        notas[i] = scanner.nextDouble();
    }
    double media = (notas[0]+notas[1]+notas[2]+notas[3])/4.0;
    if(media >= 7.00) {
        System.out.printf("A media do aluno eh %.2f - APROVADO!", media);
    }else{
        System.out.printf("A media do aluno eh %.2f - RECUPERACAO!", media);
    }


    }
}
