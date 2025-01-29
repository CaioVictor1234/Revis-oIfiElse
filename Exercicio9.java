package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando que o úsuario digite um número.
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        //Estrutura condicional que verifica se o número está no intervalo entre 10 e 50.
            if (numero > 10 & numero < 50){
                System.out.println("O número está no intevalo entre 10 e 50:");
            }else {
                System.out.println("O número não está no intervalo entre 10 e 50:");
            }
    }
}
