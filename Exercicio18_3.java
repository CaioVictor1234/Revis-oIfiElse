package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio18_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inserção de dados
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        //Estrutura condicional para verificação do nome
        if (nome.length() > 0 && (nome.charAt(0) == 'A' || nome.charAt(0) == 'a')) {
            System.out.println("Esse nome começa com a letra a.");
        } else {
            System.out.println("Esse nome não começa com a letra a.");
        }

    }
}
