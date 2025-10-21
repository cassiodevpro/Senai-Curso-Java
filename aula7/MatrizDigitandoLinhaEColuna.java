import java.util.Scanner;

public class MatrizDigitandoLinhaEColuna {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a coluna a ser excluida");
        int coluna = sc.nextInt();
        System.out.println("Digite a linha a ser excluida:");
        int linha = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j<= 10; j++){
                if(j == coluna || i == linha){
                    System.out.print("  ");
                }else {
                    System.out.print(j+" ");
                }
            }
            System.out.println(" ");

        }
        }

    }