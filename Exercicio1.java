package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedir para o úsuario inserir um número.
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

        //Estrutura condicional para verificar se o número é positivo ou negativo.
                if(numero >= 0){
                        System.out.println("O número "+numero+" é positivo:");
                }else{
                    System.out.println("O número "+ numero+" é negativo:");
                }
    }
}
