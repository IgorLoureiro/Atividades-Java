import java.util.Scanner;

public class ListaJava216Falha{
    
    public static void main(String[] args){

        double metro;
        double litro;
        double preço;
        double preço2;
        double preço3;
        double lata;
        double galão;
        double mistura_lata;
        double mistura_lata1;
        double mistura_galão;
        String Resposta;
        String Galão = "Galão";
        String Lata = "Lata";

        System.out.println("Quantos metros quadrados é o tamanho da aréa a ser pintada?");
        Scanner teclado = new Scanner (System.in);
        metro = teclado.nextDouble();

        litro = metro/6;

        System.out.println("Você deseja comprar em lata de 18 litros a R$80,00 cada, Galão de 3,6 litros a R$ 25,00 cada ou ambos para que haja menos desperdicio? ");
        Scanner teclado2 = new Scanner (System.in);
        Resposta = teclado2.next();

        if (Resposta.equals(Lata)){

            lata = Math.ceil(litro/18);
            preço = lata * 80;

            System.out.printf("A quantidade de latas necessarias para pintar o local é de " + lata + " resultando em um preço de %.2f ", preço);

        }

        else if (Resposta.equals(Galão)){

            galão = Math.ceil(litro/3.6);
            preço = galão * 25;

            System.out.printf("A quantidade de Galões necessarios para pintar o local é de " + galão + " resultando em um preço de %.2f ", preço);

        }

        else {

            mistura_lata = (litro/18);
            mistura_lata1 = mistura_lata * 18;
            mistura_galão = (litro - mistura_lata1)/3.6;

            lata = Math.ceil(litro/18);
            galão = Math.ceil(litro/3.6);

            if (litro - (mistura_lata * 18) % 3.6 != 0){
                mistura_galão += 1;
            }
            
            preço = (mistura_galão * 25) + (mistura_lata * 80);

            System.out.printf("Serão necessárias " + mistura_lata + " Latas e " + mistura_galão + "galão(ões), resultando em um preço de %.2f", preço);

        }
     
    }
}
