//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class JavaLista29 {
    public static void main(String[] args) throws Exception{

        Double Celsius, Farenheit;
    
        System.out.println("Informe a temperatura em Graus Celsius para ser convertida em Farenheit: ");
        Scanner teclado = new Scanner(System.in);
        Celsius = teclado.nextDouble();

        Farenheit = (Celsius * 1.8) + 32;

        System.out.println("A temperatura convertida para Farenheit é igual a " + Farenheit);


    }
}
