package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Essa letra é uma vogal.");
        }else {
            System.out.println("Esta letra é uma consoante.");

        }
    }
}
