package aula5;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int numeroInteiro = sc.nextInt();
        if (numeroInteiro % 2 == 0) {
            System.out.println("O numero " + numeroInteiro + " e par.");
        } else {
            System.out.println("O numero " + numeroInteiro + " e impar.");
        }

    }
}
