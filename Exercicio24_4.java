package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio24_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um lado do triângulo:");
        int lado1 = scanner.nextInt();
        System.out.println("Digite um lado do triângulo:");
        int lado2 = scanner.nextInt();
        System.out.println("Digite um lado do triângulo:");
        int lado3 = scanner.nextInt();


                if (lado1 + lado2 > lado3 && lado3 + lado2 > lado1 && lado1 + lado3 > lado2){
                    System.out.println("Os lados formam um triângulo:");
                }else {
                    System.out.println("Os lados não formam um triângulo:");
                }
    }
}
