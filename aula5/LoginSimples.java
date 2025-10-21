package aula5;

import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o login: ");
        String login = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (login.equals("admin") && senha.equals("12345")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos!");

            sc.close();
        }
    }

}
