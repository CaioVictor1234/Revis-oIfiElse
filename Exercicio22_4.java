package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio22_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();

            int diferenca = numero1 - numero2;

                    if (diferenca < 0){
                        System.out.println("A diferença dos 2 números é negativa");
                    }else {
                        System.out.println("A diferença dos 2 números é positiva:");
                    }
    }
}
