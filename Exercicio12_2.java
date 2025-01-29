package ExerciciosIfElseCaioeNikolas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio12_2 {
    public static void main(String[] args) {
        //Declaração do scanner
        Scanner scanner = new Scanner(System.in);
        // Entrada da nota .
        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();
        //Verificação condicional das notas.
        if (nota >= 5 && nota < 7){
            System.out.println("Média.");
        } else if (nota > 7) {
            System.out.println("Aprovado.");
        }else {
            System.out.println("Reprovado.");
        }

    }
}
