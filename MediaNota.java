import java.util.Scanner;

public class MediaNota {

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nota = 0;
            double media = 0;
            
            System.out.print("Digite a primeira nota ");
            double a = sc.nextDouble();
            System.out.print("Digite a segunda nota ");
            double b =  sc.nextDouble();
            System.out.print("Digite a terceira nota ");
            double c =  sc.nextDouble();
            
            nota = a + b + c ;
            media = nota / 3 ;
            
            if(media < 6.75 ){
                 System.out.println("Olá, a sua media é: " + media + " Voce foi reprovado!");
            }else{
                System.out.println("Olá, a sua media é: " + media + " Voce foi Aprovado!");
            }
            
            sc.close();
            
}
}
