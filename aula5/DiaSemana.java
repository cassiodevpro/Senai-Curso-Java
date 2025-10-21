package aula5;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 equivalente um dia da semana:");
        int dia = sc.nextInt();
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terca-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Valor invalido! Digite um numero de 1 a 7.");
        }
    }

}
