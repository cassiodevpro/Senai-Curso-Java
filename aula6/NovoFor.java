package aula6;
import java.util.Scanner;

public class NovoFor {

    public static void main(String[] args) {

        System.out.println("====TABUADA====");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero da tabuada: ");
        int numero = sc.nextInt();

        System.out.println("====TABUADA DA SOMA==== " + numero);
        for(int soma = 1; soma <=10; soma++ ){
            int resultado = numero + soma;
            System.out.println(soma + " + " + numero + " = " + resultado );
        }
        System.out.println("====TABUADA DE MULTIPLICAÇÃO==== " + numero);
        for(int multiplicacao = 1; multiplicacao <=10; multiplicacao++ ){
            int resultado = numero * multiplicacao;
            System.out.println(multiplicacao + " X " + numero + " = " + resultado );
        }
        System.out.println("==== TABUADA DA DIVISÃO ====");
        for (float divisao = 1; divisao <= 10; divisao++) {
            float resultado = numero / divisao;
            System.out.printf("%.2f / %.2f = %.2f%n", (float)numero, divisao, resultado);
        }
        System.out.println("====TABUADA DA SUBTRAÇÃO==== " + numero);
        for(int subtracao = 1; subtracao <=10; subtracao++ ){
            int resultado = subtracao - numero;
            System.out.println(subtracao + " - " + numero + " = " + resultado );
        }
    }
}
