import java.util.Scanner;

public class JavaLista216 {
    public static void main(String[] args) throws Exception{

        double litros, metros, latas, galoes, preço, preço2, preço3, mistura_lata, mistura_galao;

        System.out.println("Informe a quantidade de metros que necessitam ser pintados");
        Scanner teclado = new Scanner (System.in);
        metros = teclado.nextDouble();

        litros = (metros/6) * 0.1;

        latas = Math.ceil(litros/18);
        galoes = Math.ceil(litros/3.6);

        mistura_lata = Math.ceil(litros/18);
        mistura_galao = Math.ceil((litros % 18)/3.6);

        preço = latas * 80;
        preço2 = galoes *25;
        preço3 = (mistura_lata * 80) + (mistura_galao * 25);

        System.out.printf("Será necessário %.2f litros de tinta \n", litros);
        System.out.printf("Você pode optar por comprar %.2f latas de tinta com o preço de %.2f \n", latas, preço);
        System.out.printf("Você pode optar também por comprar %.2f galões, resultando em um preço de %.2f \n", galoes, preço2);
        System.out.printf("Por fim, você pode comprar %.2f latas e %.2f pelo preço de %.2f", mistura_lata, mistura_galao, preço3);
    }
}