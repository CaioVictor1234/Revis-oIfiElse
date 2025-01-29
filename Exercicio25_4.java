package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio25_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();


                    if (numero % 4 == 0) {
                        System.out.println(numero + " é um quadrado perfeito.");
                    } else {
                        System.out.println(numero + " não é um quadrado perfeito.");
                    }
    }
}
