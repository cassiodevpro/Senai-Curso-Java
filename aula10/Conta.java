package aula10;

public class Conta {

    String numeroDaConta;
    String nome;
    String senha = "1234";
    double saldo = 10000;

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }   

    // Exemplo de método para exibir informações da conta
    public void exibirInformacoes() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Conta.class.getName());

        logger.info("Bem-vindo ao Caixa Eletrônico, " + getNome() + "!");
        logger.info("Número da Conta: " + getNumeroDaConta());
        logger.info("Saldo Inicial: R$" + getSaldo());

        int opcao;
        do {
            logger.info("\nMenu:");
            logger.info("1. Consultar saldo");
            logger.info("2. Depositar");
            logger.info("3. Sacar");
            logger.info("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
                logger.info("Seu saldo atual é: R$" + getSaldo());
                break;
            case 2:
                System.out.print("Digite o valor para depósito: ");
                double valorDeposito = scanner.nextDouble();
                depositar(valorDeposito);
                break;
            case 3:
                System.out.print("Digite o valor para saque: ");
                double valorSaque = scanner.nextDouble();
                sacar(valorSaque);
                break;
            case 4:
                logger.info("Saindo do caixa eletrônico. Obrigado!");
                break;
            default:
                logger.warning("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

}
