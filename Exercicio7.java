package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando o úsuario á inserir um número.
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
            //Estrutura condicional que verifica se o número é multiplo de 5.
            if (numero % 5 == 0){
                System.out.println("O número é multiplo de 5:");
            }else {
                System.out.println("O número não é um multiplo de 5:");
            }
    }
}
