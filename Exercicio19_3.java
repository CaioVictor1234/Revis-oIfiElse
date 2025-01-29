package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio19_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma palavra:");
            String Palavra = scanner.nextLine();

                if (Palavra.length() > 5){
                    System.out.println("Essa palavra tem mais de 5 letras:");
                }else if (Palavra.length() == 5){
                    System.out.println("Essa palavra tem  5 letras:");
                } else {
                    System.out.println("Essa palavra tem menos de 5 letras:");
                }
    }
}
