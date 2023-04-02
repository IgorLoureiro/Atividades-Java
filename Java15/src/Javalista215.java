//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
//faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido
import java.util.Scanner;

public class Javalista215 {
    public static void main(String[] args) throws Exception{

        Double GanhoHora;
        Double HoraMes;
        Double Salario;
        Double INSS;
        Double Imposto;
        Double Sindicato;
        Double Liquido;

        System.out.println("Quantas horas você trabalha por mês? ");
        Scanner teclado = new Scanner (System.in);
        HoraMes = teclado.nextDouble();

        System.out.println("Quanto você ganha por hora? ");
        Scanner teclado2 = new Scanner (System.in);
        GanhoHora = teclado2.nextDouble();

        Salario = (GanhoHora * HoraMes);
        INSS = Salario * 0.08;
        Imposto = Salario * 0.11;
        Sindicato = Salario * 0.05;
        Liquido = Salario - INSS - Imposto - Sindicato;


        System.out.printf("O seu salário bruto é de " + Salario  + ", seu desconto do INSS é de " + INSS + ", seu desconto de Imposto é de Renda é " + Imposto + 
        ", Seu desconto de sindicato é " + Sindicato + ", Resultando em um salário liquido de %.2f", Liquido);

    
    }
}
