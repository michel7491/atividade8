package exerciciosEmJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de termos
        System.out.print("Digite a quantidade de números da sequência de Fibonacci que deseja exibir: ");
        int n = scanner.nextInt();

        // Valida a entrada
        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("Sequência de Fibonacci:");
            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(); // Linha em branco ao final
        }

        scanner.close();
    }
}
