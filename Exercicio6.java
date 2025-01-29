package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Iniciando um scanner.
        Scanner scanner = new Scanner(System.in);
        //Pedindo ao usuario um ano para verificação.
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();
        //Estrutura condicional para verificação do ano.
        if (ano % 4 == 0) {
            System.out.println("Esse ano é bisexto.");
        } else {
                System.out.println("Esse ano não é bisexto.");

        }
    }
    }
