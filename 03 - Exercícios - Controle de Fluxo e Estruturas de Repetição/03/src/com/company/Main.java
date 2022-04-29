package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Esse programa vai contar de 1 até 100");
    int[] umAteCem = new int[100];
    for(int i = 0; i < 100; i++){
        umAteCem[i] = i + 1;
        System.out.printf("%d!", umAteCem[i]);
        if(umAteCem[i] % 10 == 0){
            System.out.printf(" Múltiplo de 10\n");
        }else{
            System.out.printf("\n");
        }
    }

    }
}
