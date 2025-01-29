package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio23_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();


               if (numero2 != 0 && numero1 % numero2 == 0){
                   System.out.printf("%d é divisível por %d.\n", numero1, numero2);
               } else if (numero1 != 0 && numero2 % numero1 == 0) {
                   System.out.printf("%d é divisível por %d.\n", numero2, numero1);
               }else {
                   System.out.print("Nenhum dos dois é divisivel pelo outro");
               }
    }
}
