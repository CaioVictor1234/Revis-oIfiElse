package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio17_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inserção de dados
        System.out.println("Digite uma senha: ");
        int senha = sc.nextInt();
        System.out.println("Confirme sua senha: ");
        int senha2 = sc.nextInt();
        //Verificação condicional das senhas
        if (senha != senha2){
            System.out.println("Sua senha está incorreta. ");
        }else{
            System.out.println("Sua senha está correta. ");
        }
    }
}
