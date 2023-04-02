//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class JavaLista27 {
    public static void main(String[] args) throws Exception{

        Double GanhoHora, HorasMes, Salario;

        System.out.println("Quanto você ganha por hora? ");
        Scanner teclado = new Scanner (System.in);
        GanhoHora = teclado.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        Scanner teclado2 = new Scanner(System.in);
        HorasMes = teclado2.nextDouble();

        Salario = (GanhoHora * HorasMes);

        System.out.println("O Total do seu Salário no mês é de " + Salario);
    }
    
}
