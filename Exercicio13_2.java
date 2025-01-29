package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando o úsuario que insira os valores
        System.out.println("Digite a primeira nota:");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota:");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota:");
        int nota3 = scanner.nextInt();
            //Estrutura condicional que verifica o maior número.
            if (nota1 > nota2 & nota1 > nota3){
                System.out.println("A primeira nota é maior.");
            } else if (nota2 > nota1 & nota2 > nota3) {
                System.out.println("A segunda nota é maior.");
            }else{
                System.out.println("A terceira nota é maior.");
            }
                //Estrutura condicional que verifica o maior número.
                    if (nota1 < nota2 & nota1 < nota3){
                        System.out.println("A primeira nota é menor.");
                    } else if (nota2 > nota1 & nota2 > nota3) {
                        System.out.println("A segunda nota é menor.");
                    }else{
                        System.out.println("A terceira nota é menor.");
                    }
        }
    }

