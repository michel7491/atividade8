package exerciciosEmJava;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita a frase ao usuário
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            // Remove espaços extras no início e no final e divide a frase em palavras
            String[] palavras = frase.trim().split("\\s+");

            // Conta o número de palavras
            int numeroDePalavras = frase.isBlank() ? 0 : palavras.length;

            // Exibe o resultado
            System.out.println("A frase contém " + numeroDePalavras + " palavra(s).");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema ao processar a frase.");
        }
    }
}
