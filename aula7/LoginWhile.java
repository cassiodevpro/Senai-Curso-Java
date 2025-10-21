import java.util.Scanner;
public class LoginWhile {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String senhaCorreta = "1234";
       String senhaDigitada = "";

       while(!senhaDigitada.equals(senhaCorreta)) {
           System.out.println("Digite a senha ; ");
           senhaDigitada = sc.nextLine();

           if (senhaDigitada.equals(senhaCorreta)){
               System.out.println("A senha esta incorreta!");
           }
       }
        System.out.println("A senha esta correta! o sistema parou!!");
        sc.close();
    }
}
