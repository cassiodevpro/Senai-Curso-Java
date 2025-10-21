package aula9;
import java.util.Scanner;
public class Imc {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu peso:");
        float peso = scanner.nextFloat();
        System.out.println("Digite sua altura:");
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);

        System.out.println("=== CÁLCULO DE IMC ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println(nome + " Classificação: Abaixo do peso");
        }else if (imc < 25) {
            System.out.println(nome + " Classificação: Peso Normal");
        } else if (imc < 30) {
            System.out.println(nome + " Classificação: Sobrepeso");
        } else {
            System.out.println(nome + " Classificação: Obesidade");
        }
    }
}
