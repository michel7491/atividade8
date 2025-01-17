package exerciciosEmJava;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 50
        int numeroSecreto = random.nextInt(50) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 50).");

        boolean acertou = false;

        while (!acertou) {
            try {
                // Solicita um palpite ao usuário
                System.out.print("Digite seu palpite: ");
                int palpite = scanner.nextInt();

                // Valida se o número está no intervalo permitido
                if (palpite < 1 || palpite > 50) {
                    System.out.println("Erro: O número deve estar entre 1 e 50.");
                } else if (palpite == numeroSecreto) {
                    System.out.println("Parabéns! Você adivinhou o número correto: " + numeroSecreto);
                    acertou = true;
                } else if (palpite < numeroSecreto) {
                    System.out.println("Errado! O número secreto é maior. Tente novamente.");
                } else {
                    System.out.println("Errado! O número secreto é menor. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, insira apenas números inteiros.");
                scanner.nextLine(); // Limpa o buffer de entrada
            }
        }

        scanner.close();
    }
}
