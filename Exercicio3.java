package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitando ao úsuario que insire 2 números.
        System.out.println("Digite o número 1:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o numero 2:");
        int numero2 = scanner.nextInt();
        //Verificação para ver qual número é maior.
            if (numero1 > numero2){
                System.out.println("O numero 1 é maior que o número 2:");
            }else{
                System.out.println("O número 2 é maior que o numero 1:");
            }
    }
}
