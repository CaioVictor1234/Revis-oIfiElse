package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio26_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

                    if (idade >= 0 && idade  <= 12 ){
                        System.out.println("Criança:");
                    } else if (idade >= 13 && idade <= 18) {
                        System.out.println("Adolecente:");
                    } else if (idade > 19 && idade <= 50) {
                        System.out.println("Adulto:");
                    }else {
                        System.out.println("Velho:");
                    }
    }
}
