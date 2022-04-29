package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("De 1 a 100 de forma decrescente: ");
        int[] deCemAUm = new int[100];
        for (int i = 99; i>=0; i--){
            deCemAUm[i] = i+1;
            System.out.printf("%d\n", deCemAUm[i]);
        }
    }
}
