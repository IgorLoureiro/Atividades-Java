//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: o produto do dobro do primeiro com metade do segundo . a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

import java.util.Scanner;

public class JavaLista210 {
    public static void main(String[] args) throws Exception{

        Double Numero1;
        Double Numero2;
        Double Numero3;
        Double Numero4;
        Double Numero5;
        Double Numero6;

        System.out.println("Escreva 2 números inteiros e um real");
        Scanner teclado = new Scanner (System.in);
        Numero1 = teclado.nextDouble();
        Numero2 = teclado.nextDouble();
        Numero3 = teclado.nextDouble();

        Numero4 = (Numero1*2) + (Numero2/2);
        Numero5 = (Numero1 * 3) + Numero3;
        Numero6 = Math.pow(Numero3, 3);

        System.out.println(" O produto do dobro do primeiro com a metade do Segundo é igual a " + Numero4 + " A soma do triplo do primeiro com o terceiro é igual a " + Numero5 + 
        " o Terceiro elevado ao cubo que é igual a " + Numero6);

    }
}
