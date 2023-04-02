import java.util.Scanner;

public class JavaLista213 {
    public static void main(String[] args) throws Exception{

        String sexo;
        String homem1 = "homem";
        String mulher1 = "mulher";
        Double altura;
        Double pesoideal;

        System.out.println("Você se identifica como homem ou mulher? ");
        Scanner teclado = new Scanner (System.in);
        sexo = teclado.next();

        System.out.println("Qual sua altura? ");
        Scanner teclado2 = new Scanner (System.in);
        altura = teclado2.nextDouble();

        if (sexo.equals(homem1)){

            pesoideal = (72.7 * altura) - 58; 

            System.out.println("Seu peso ideal é de " + pesoideal);

        }

        else {

            pesoideal = (62.1 * altura) - 44.7;

            System.out.println("Seu peso ideal é de " + pesoideal);

    }

    }
}
