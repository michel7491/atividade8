package exerciciosEmJava;

import java.util.Scanner;

public class NumerosInvertidos {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário um número inteiro
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Variável para armazenar o número invertido
            int numeroInvertido = 0;

            // Inverte o número
            while (numero != 0) {
                numeroInvertido = numeroInvertido * 10 + numero % 10;
                numero /= 10;
            }

            // Exibe o número invertido
            System.out.println("Número invertido: " + numeroInvertido);
        } catch (Exception e) {
            System.out.println("Erro: Por favor, insira um número inteiro válido.");
        }
    }
}
