package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedindo ao usúario que insira um número.
        System.out.println("Insira um número:");
        int numero = scanner.nextInt();
        //Verificando se o número é par ou impar.
        if(numero % 2 == 0) {
            System.out.println("O número "+ numero +" é par:");
        } else {
            System.out.println("O número "+ numero +" é impar:");
        }
    }
}
