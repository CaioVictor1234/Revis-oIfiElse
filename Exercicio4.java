package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedindo ao usúario que insira uma idade.
        System.out.println("Insira uma idade:");
        int idade = scanner.nextInt();
        //Verificando se uma pessoa pode votar.
        if (idade > 16){
            System.out.println("Então a pessoa pode votar.");
        } else{
            System.out.println("Você não pode votar.");
        }
    }
}