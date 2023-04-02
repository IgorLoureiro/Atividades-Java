import java.util.Scanner;

public class JavaLista23 {
    public static void main(String[] args) throws Exception{

        Double nota1, nota2, nota3, nota4, média;

        System.out.println("Informe as suas 4 notas do Semestre para receber a média entre elas: ");
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();

        média = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média das suas notas é igual a " + média);

    }   
}
