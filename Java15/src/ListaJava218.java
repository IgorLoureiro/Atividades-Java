//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class ListaJava218 {
    public static void main(String[] args) throws Exception{

        double mbps;
        double MB;
        Double minuto;

        System.out.println("Informe o tamanho do arquivo em MB e a velocidade de download em Mbps: ");
        Scanner teclado = new Scanner (System.in);
        MB = teclado.nextDouble();
        mbps = teclado.nextDouble();

        minuto = (MB/mbps) * 60;

        System.out.printf("O tempo estimado para o download do arquivo é de %.0f Minutos", minuto);


    }
}
