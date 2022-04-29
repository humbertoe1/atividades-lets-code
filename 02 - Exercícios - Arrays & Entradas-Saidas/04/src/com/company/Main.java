package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String[] nomeDaPraia = new String[5];
    float[] distanciaDaPraia = new float[5];
    int contadorDePraiasEntreDezEQuinzeKm = 0;
    float distanciaMediaDasPraias = 0.0f;
    float maiorDistancia = 0.0f;
    int indexPraiaMaisDistante = 0;



    for(int i = 0; i < 5; i ++){
        System.out.println("Digite o nome da praia: ");
        nomeDaPraia[i] = scanner.nextLine();
        System.out.println("Digite a distancia em KM da praia ao hotel:");
        distanciaDaPraia[i] = scanner.nextFloat();
        scanner.nextLine();
        if(distanciaDaPraia[i] > maiorDistancia){
            indexPraiaMaisDistante = i;
            maiorDistancia = distanciaDaPraia[i];
        }
        if(distanciaDaPraia[i] > 10.0 && distanciaDaPraia[i] < 15.0){
            contadorDePraiasEntreDezEQuinzeKm++;
        }
        distanciaMediaDasPraias+= distanciaDaPraia[i];

    }
    distanciaMediaDasPraias = distanciaMediaDasPraias/5.0f;

    System.out.printf("A praia mais distante eh: %s\nExistem %d praias que ficam entre 10km e 15km de distancia!\nA distancia media das praias eh: %.2f km\n", nomeDaPraia[indexPraiaMaisDistante], contadorDePraiasEntreDezEQuinzeKm, distanciaMediaDasPraias);

    }
}
