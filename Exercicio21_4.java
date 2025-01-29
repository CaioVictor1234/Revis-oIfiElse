package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio21_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();

                    int somaDosNumeros = numero1 + numero2;

                            if (somaDosNumeros > 100){
                                System.out.println("A soma dos números é maior que 100:");
                            }else {
                                System.out.println("A soma dos números não é maior que 100:");
                            }
    }
}
