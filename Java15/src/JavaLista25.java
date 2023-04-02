// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class JavaLista25 {
    public static void main(String[] args) throws Exception{

        Double raio;
        Double area;
        Double raio2;

        System.out.println("Informe o raio de um círuclo para que seja cálculada sua área: ");
        Scanner teclado = new Scanner (System.in);
        raio = teclado.nextDouble();

        raio2 = (raio * raio);

        area = raio2 * 3.1415;

        System.out.println("A area do circulo é igual a " + raio);


    }
}
