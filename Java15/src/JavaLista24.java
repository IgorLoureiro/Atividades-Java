import java.util.Scanner;

public class JavaLista24 {
    public static void main(String[] args) throws Exception{

        Double metros;
        Double centi;

        System.out.println("Informe o numero em metros para converter para centimetros: ");
        Scanner teclado = new Scanner(System.in);
        metros = teclado.nextDouble();
        centi = (metros * 100);

        System.out.println("Os metros informados convertidos em centimetros é igual a " + centi);
    }
}
