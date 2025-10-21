package aula5;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do triangulo:");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo lado do triangulo:");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro lado do triangulo:");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triangulo e equilatero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triangulo e isosceles.");
        } else {
            System.out.println("O triangulo e escaleno.");
        }
    }

}
