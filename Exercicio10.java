package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 99 && numero < 201){
            System.out.println("Esse numero está entre o intervlo de 100 e 200");
        }else {
            System.out.println("Esse número não esta no intervalo de 100 a 200");
        }
    }
}
