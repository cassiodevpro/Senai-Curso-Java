package aula8;

import java.util.Scanner;

public class CalcularWhile {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int valor2 = 0;
        int valor1 = 0;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Escolha o numero da operação: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Até logo!");
                break;
            }
            if (opcao < 1 || opcao > 4){
                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("Escolha o primeiro número a ser calculado:");
            valor1 = sc.nextInt();
            System.out.println("Escolha o segundo número a ser calculado:");
            valor2 = sc.nextInt();

            int soma = valor1 + valor2;
            int subtracao = valor1 - valor2;
            int multiplicacao = valor1 * valor2;

            if (opcao == 1) {
                System.out.println("A SOMA É: ==> " + soma + " <== ");
            } else if (opcao == 2) {
                System.out.println("A SUBTRAÇÃO É: ==> " + subtracao + " <== ");
            } else if (opcao == 3) {
                System.out.println("A MULTIPLICAÇÃO É: ==> " + multiplicacao + " <== ");
            } else if (opcao == 4) {
                if (valor2 != 0) {
                    int divisao = valor1 / valor2;
                    System.out.println("A DIVISÃO É: ==> " + divisao + " <== ");
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
            }
        } while (true); 
        sc.close();
    }
}