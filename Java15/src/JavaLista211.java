//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;

public class JavaLista211 {
    public static void main(String[] args) throws Exception{

        Double altura;
        Double peso;

        System.out.println("Informe sua altura para descobrir seu peso ideal: ");
        Scanner teclado = new Scanner (System.in);
        altura = teclado.nextDouble();

        peso = (72 * altura) - 58;

        System.out.println("O seu peso ideal é " + peso);

    }
    
}
