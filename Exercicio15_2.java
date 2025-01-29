package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando que o úsuario insira as notas de uma diciplina.
        System.out.println("Digite sua primeira nota:");
        int nota1 = scanner.nextInt();
        System.out.println("Digite sua segunda nota:");
        int nota2 = scanner.nextInt();
        System.out.println("Digite sua terceira nota:");
        int nota3 = scanner.nextInt();
        System.out.println("Digite sua quarta nota:");
        int nota4 = scanner.nextInt();
        //Solicitando que o úsuario insira as notas de uma outra diciplina.
                System.out.println("Digite sua primeira nota da outra diciplina:");
                int nota1SegundaDiciplina = scanner.nextInt();
                System.out.println("Digite sua segunda nota da outra diciplina:");
                int nota2SegundaDiciplina = scanner.nextInt();
                System.out.println("Digite sua terceira nota da outra diciplina:");
                int nota3SegundaDiciplina = scanner.nextInt();
                System.out.println("Digite sua quarta nota da outra diciplina:");
                int nota4SegundaDiciplina = scanner.nextInt();
                        //Calculo pra saber a media das notas de ambas diciplinas.
                        int SomaDasNotas1 = nota1 + nota2 + nota3 + nota4;
                        int MediaDasNotas1 = SomaDasNotas1 / 4;
                        int SomaDasNotas2 = nota1SegundaDiciplina + nota2SegundaDiciplina + nota3SegundaDiciplina + nota4SegundaDiciplina;
                        int MediaDasNotas2 = SomaDasNotas2 / 4;
                            //Verificação se o aluno foi aprovado em ambas, ou foi aprovado em uma, ou não foi aprovado.
                            if (MediaDasNotas1 >= 10 & MediaDasNotas2 >= 10){
                                System.out.println("Aluno aprovado em ambas");
                            } else if (MediaDasNotas1 <= 10 & MediaDasNotas2 >= 10 || MediaDasNotas1 >= 10 & MediaDasNotas2 <= 10) {
                                System.out.println("Aluno aprovado em uma");
                            }else {
                                System.out.println("Aluno reprovado em ambas");
                            }
    }
}
