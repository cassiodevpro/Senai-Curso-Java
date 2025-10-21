package aula6;

public class InicioFor {public static void main(String[] args) {

        System.out.println("Numeros de 2 em 2");

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println("numeros:" + i);
            }
        }
    }
}