package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int tentativas = 3;
        int numeroAletaorio = aleatorio.nextInt(10)+1;
        System.out.println(numeroAletaorio);
        int numeroTentado;
        System.out.println("Um numero entre 1 e 10 foi gerado aleatoriamente.");
        while(tentativas > 0)
        {
            System.out.println("Tente adivinhar o numero gerado: ");
            numeroTentado = scanner.nextInt();
            if (numeroTentado == numeroAletaorio){
                System.out.println("Voce acertou! SUCESSO!");
                break;
            }else{
                if(tentativas > 1) {
                    System.out.println("Tente novamente!");
                }
                tentativas--;
            }

        }
        if(tentativas == 0)
            System.out.println("Voce falhou. Treine sua sorte!");
    }
}
