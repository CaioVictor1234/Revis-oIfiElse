package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio27_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if ( numero>= 0 && numero  <= 10 ){
            System.out.println("A:");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("B:");
        } else if (numero >= 21 && numero <= 30){
            System.out.println("C:");
        }
    }
}
