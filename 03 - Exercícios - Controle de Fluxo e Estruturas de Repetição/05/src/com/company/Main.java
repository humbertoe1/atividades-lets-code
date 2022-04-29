package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre seu peso em KG: ");
        float peso = scanner.nextFloat();
        System.out.println("Entre sua altura em metros: ");
        float altura = scanner.nextFloat();

        float imc = peso/(altura*altura);

        System.out.printf("Seu IMC eh %.2f - ", imc);
        if (imc >= 18.5 && imc <= 24.9){
            System.out.println("PESO NORMAL!");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("ACIMA DO PESO");
        }else if(imc >= 30){
            System.out.println("VOCE ESTA OBESO!");
        }else{
            System.out.println("VOCE ESTA ABAIXO DO PESO!");
        }
    }
}
