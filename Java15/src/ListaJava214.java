//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o 
//estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a 
//variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
//Imprima os dados do programa com as mensagens adequadas.
import java.util.Scanner;

public class ListaJava214 {
    public static void main(String[] args) throws Exception{

        Double peso;
        Double excesso;
        Double multa;

        System.out.println("Qual o peso do peixe (Em Kilogramas) que você pegou hoje, João? ");
        Scanner teclado = new Scanner (System.in);
        peso = teclado.nextDouble();

        if (peso > 50){

            excesso = peso - 50;

            multa = excesso * 4.00;

            System.out.println("O excesso de peso do peixe é de " + excesso + " e sua multa é de R$ " + multa);

        }

        else{

            System.out.println("o Peso do peixe não é suficiente para aplicação de multa");

        }
    }
}
