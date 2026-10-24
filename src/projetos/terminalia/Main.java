package projetos.terminalia;

import java.util.Scanner;

/*
 * Terminalia - projeto de terminal.
 * Ponto de entrada próprio: roda de forma independente dos outros projetos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Terminalia ===");
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao Terminalia.");
        scanner.close();
    }
}
