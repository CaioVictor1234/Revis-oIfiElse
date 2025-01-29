package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio16_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inserção de dados
        System.out.println("Receba sim ou não: ");
        String palavra = scanner.nextLine();
        //Verificação condicional da palavra digitada
        if (palavra == "sim"){
            System.out.println("Você digitou sim. ");
        } else if (palavra == "não") {
            System.out.println("Você digitou não. ");

        }
    }
}
