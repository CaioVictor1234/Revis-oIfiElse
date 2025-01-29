package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio14_2 {
    public static void main(String[] args) {
        //Declaração no scanner
        Scanner scanner = new Scanner(System.in);
        //Inserição de dados
        System.out.println("Veja se a nota foi máxima: ");
        int nota = scanner.nextInt();
        //Verificação condicional da nota.
        if (nota >= 10){
            System.out.println("Essa é a nota máxima.");
        }else {
            System.out.println("Essa não é a nota máxima.");
        }
    }
}
