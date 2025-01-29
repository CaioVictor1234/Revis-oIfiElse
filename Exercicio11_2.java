package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a primeira nota:");
            int nota1 = scanner.nextInt();
            System.out.println("Digite a segunda nota:");
            int nota2 = scanner.nextInt();

                int SomaDasNotas = nota1 + nota2;
                int MediaDasNotas = SomaDasNotas / 2;

                    if (MediaDasNotas >= 7){
                        System.out.println("O aluno está aprovado:");
                    }else {
                        System.out.println("O aluno está reprovado:");
                    }
    }
}
