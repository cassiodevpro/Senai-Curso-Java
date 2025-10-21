package aula10;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Conta minhaConta = new Conta();
        System.out.print("Digite o nome do titular da conta: ");
        minhaConta.setNome(teclado.nextLine());
        minhaConta.setNumeroDaConta("123456");
        minhaConta.setSenha("1234");

        minhaConta.exibirInformacoes();

}
}