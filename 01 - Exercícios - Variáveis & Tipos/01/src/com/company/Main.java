package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float CONVERSOR_CELSIUS_TO_KELVIN = 273.15f;
        final float MULTIPLIER_CELSIUS_TO_FAHRENHEIT_OR_RANKINE = 1.8f;
        //combine this multiplier with the specific adder.
        final float CONVERSOR_REAUMUR = 0.8f;
        final float ADDER_CELSIUS_TO_FAHRENHEIT = 32.0f;
        final float ADDER_CELSIUS_TO_RANKINE = 491.67f;



        System.out.println("Digite o valor da temperatura em Graus Celsius: ");
        float temperatura = scanner.nextFloat();

        System.out.printf("Essa temperatura em Celsius eh: %.2f\n", temperatura);
        System.out.printf("Essa temperatura em Kelvin eh: %.2f\n", temperatura + CONVERSOR_CELSIUS_TO_KELVIN);
        System.out.printf("Essa temperatura em Fahrenheit eh: %.2f\n", (temperatura*MULTIPLIER_CELSIUS_TO_FAHRENHEIT_OR_RANKINE) + ADDER_CELSIUS_TO_FAHRENHEIT);
        System.out.printf("Essa temperatura em Rankine eh: %.2f\n", (temperatura*MULTIPLIER_CELSIUS_TO_FAHRENHEIT_OR_RANKINE) + ADDER_CELSIUS_TO_RANKINE);
        System.out.printf("Essa temperatura em Reaumur eh: %.2f\n", temperatura*CONVERSOR_REAUMUR);

    }
}
