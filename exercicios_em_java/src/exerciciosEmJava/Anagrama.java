package exerciciosEmJava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita as duas palavras
            System.out.print("Digite a primeira palavra: ");
            String palavra1 = scanner.nextLine();

            System.out.print("Digite a segunda palavra: ");
            String palavra2 = scanner.nextLine();

            // Verifica se ambas as palavras contêm apenas letras
            if (apenasLetras(palavra1) && apenasLetras(palavra2)) {
                // Verifica se são anagramas
                if (saoAnagramas(palavra1, palavra2)) {
                    System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas!");
                } else {
                    System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
                }
            } else {
                System.out.println("Erro: Insira apenas letras. Números e símbolos não são permitidos.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema ao processar as palavras.");
        }
    }

    // Função para verificar se duas palavras são anagramas
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        // Remove espaços e normaliza para minúsculas
        String normalizada1 = palavra1.replaceAll("\\s", "").toLowerCase();
        String normalizada2 = palavra2.replaceAll("\\s", "").toLowerCase();

        // Converte em arrays de caracteres e ordena
        char[] array1 = normalizada1.toCharArray();
        char[] array2 = normalizada2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compara os arrays ordenados
        return Arrays.equals(array1, array2);
    }

    // Função para verificar se uma string contém apenas letras
    public static boolean apenasLetras(String palavra) {
        return palavra.matches("[a-zA-Z]+");
    }
}
