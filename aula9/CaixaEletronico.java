package aula9;
import java.util.Scanner;
import java.io.Console;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoConta = 1000;//Saldo inicial - primeiro requisito
        int opcao;
        final String SENHA_CORRETA = "12345";
        int tentativas = 3;
        boolean autenticacao = false;

        System.out.println("===BEM-VIDO AO CAIXA ELETRÔNICO===");

        Console console = System.console();
        while (tentativas > 0) {
            String senhaDigitada;
            if (console != null) {
            char[] senhaChars = console.readPassword("Digite sua senha: ");
            senhaDigitada = new String(senhaChars);
            } else {
            // Fallback para IDEs que não suportam System.console()
            System.out.println("Digite sua senha: ");
            senhaDigitada = teclado.next();
            }
            if (senhaDigitada.equals(SENHA_CORRETA)) {
            autenticacao = true;
            System.out.println("Autenticado, Bem vindo!!");
            break;
            } else {
            tentativas--;
            System.out.println("Senha incorreta tente novamente, voce tem mais : " + tentativas);
            }
        }
        if (!autenticacao) {
            System.out.println("Acesso Bloqueado tente novamente mais tarde");
            teclado.close();
            return;
        }

        do {
            System.out.println("\n --- MENU PRINCIPAL ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. " +
                    "Sair ");
            System.out.println("Escola um opção");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo e: R$: " + saldoConta);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado ");
                    double deposito = teclado.nextDouble();
                    if (deposito > 0) {
                        saldoConta += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Novo Saldo : R$ " + saldoConta);
                    } else {
                        System.out.println("Erro: valor do deposito invalido");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valo para sacar: ");
                    Double saque = teclado.nextDouble();
                    if (saque <= 0) {
                        System.out.println("Erro: valor de saque deve ser positivo");
                    } else if (saque > saldoConta) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        saldoConta -= saque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Seu novo saldo é: R$" + saldoConta);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o caixa eletronico, ate logo.");
                    break;
                default:
                    System.out.println("Opção invalida. tente novamente");
            }
        } while (opcao != 4);
        teclado.close();
    }
}
