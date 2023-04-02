import java.util.Scanner;

public class ListaJava217 {
    
    public static void main(String[] args){

        double metro;
        double litro;
        double preço;
        double lata;

        System.out.println("Quantos metros quadrados é o tamanho da aréa a ser pintada?");
        Scanner teclado = new Scanner (System.in);
        metro = teclado.nextDouble();

        litro = metro/3;
        lata = Math.ceil(litro/18);
        preço = lata * 80;

        System.out.printf("A quantidade de latas necessarias para pintar o local é de " + lata + " resultando em um preço de %.2f ", preço);

     

    }
}


