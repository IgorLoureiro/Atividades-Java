//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class JavaLista26 {
    public static void main (String[] args) throws Exception{

        Double DobroArea;
        Double Area;
        Double Lado;


        System.out.println("Informe a medida de um dos lados do quadrado para receber o dobro de sua área");
        Scanner teclado = new Scanner (System.in);
        Lado =  teclado.nextDouble();

        Area = (Lado * Lado);
        DobroArea = Area * 2;

        System.out.println("A area do Quadrado é de " + Area + " sendo o dobro de sua area " + DobroArea);

    }
}
