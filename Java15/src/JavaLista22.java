import java.util.Scanner;

public class JavaLista22 {
    public static void main(String[] args) throws Exception{

        Double numero1;
        Double numero2;
        Double numero3;

        System.out.println("Informe dois numeros para receber a soma deles: ");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextDouble();
        numero2 = teclado.nextDouble();

        numero3 = numero1 + numero2;

        System.out.println("A soma dos numeros " + numero1 + " e " + numero2 + " é igual a " + numero3);


    }
}