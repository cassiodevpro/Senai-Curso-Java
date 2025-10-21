package aula5;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a nota do aluno:");
      double nota = sc.nextDouble();
      System.out.println("Digite a frequencia do aluno:");
      double frequencia = sc.nextDouble();

      if (nota >= 7.0 && frequencia >= 75.0) {
          System.out.println("Aluno aprovado!");
      } else {
          System.out.println("Aluno reprovado!");
      }
  }

}
