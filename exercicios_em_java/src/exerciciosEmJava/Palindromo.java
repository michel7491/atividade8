package exerciciosEmJava;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma palavra ao usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Normaliza a palavra (ignora maiúsculas/minúsculas)
        String palavraNormalizada = palavra.toLowerCase();

        // Verifica se é um palíndromo
        boolean ehPalindromo = true;
        int tamanho = palavraNormalizada.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraNormalizada.charAt(i) != palavraNormalizada.charAt(tamanho - i - 1)) {
                ehPalindromo = false;
                break;
            }
        }

        // Exibe o resultado
        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
