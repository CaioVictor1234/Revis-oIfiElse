package ExerciciosIfElseCaioeNikolas;

import java.util.Scanner;

public class Exercicio28_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scane.nextDouble();
        String categoriaAltura = classificarAltura(altura);
        System.out.println("A pessoa é considerada: " + categoriaAltura);
    }
}