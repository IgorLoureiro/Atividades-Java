//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class ListaJava28 {
    public static void main(String[] args) throws Exception{

        Double Farenheit, Celsius, Numero1;

        System.out.println("Informe a temperatura em Farenheit para que seja convertida em Celsius: ");
        Scanner teclado = new Scanner (System.in);
        Farenheit = teclado.nextDouble();

        Numero1 = (Farenheit - 32)/9;

        Celsius = 5 * Numero1;

        System.out.println("Os graus farenheit informados, ao serem convertidos em Celsius é igual a " + Celsius);

    }
}
