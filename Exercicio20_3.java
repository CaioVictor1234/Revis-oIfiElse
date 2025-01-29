package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio20_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String Palavra1 = scanner.nextLine();
        System.out.println("Digite outra palavra");
        String Palavra2 = scanner.nextLine();

                if (Palavra1.length() == Palavra2.length()){
                    System.out.println("As palavras são iguais");
                }else {
                    System.out.println("As palavras não são iguais:");
                }
    }
}
