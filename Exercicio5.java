package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando o úsuario que insira os valores
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int numero3 = scanner.nextInt();
            //Estrutura condicional que verifica o maior número.
            if (numero1 > numero2 & numero1 > numero3){
                System.out.println("O primeiro número é maior.");
            } else if (numero2 > numero1 & numero2 > numero3) {
                System.out.println("O segundo número é maior.");
            }else{
                System.out.println("O terceiro número é maior.");
            }
    }
}
