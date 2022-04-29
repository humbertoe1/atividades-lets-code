package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//levando em conta: Dolar: R$ 4.80 && Euro: R$ 5.60 && Libra R$ 6.10
        final float CONVERSOR_DOLAR = 4.8f;
        final float CONVERSOR_EURO = 5.6f;
        final float CONVERSOR_LIBRA = 6.10f;
        System.out.println("Entre o valor em Real: ");
        Scanner scanner = new Scanner(System.in);

        float valorEmReal = scanner.nextFloat();

        System.out.printf("Valor em Real: BRL %.2f\nValor em Dolar: USD %.2f\nValor em Euro: EUR %.2f\nValor em Libra: GBP %.2f",
                valorEmReal, valorEmReal/CONVERSOR_DOLAR, valorEmReal/CONVERSOR_EURO, valorEmReal/CONVERSOR_LIBRA);
    }
}
