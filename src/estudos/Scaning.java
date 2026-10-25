package estudos;
import java.util.Scanner;


public class Scaning {
    public static void main(String[] args){
        // Para podermos usar o Scanner, criamos um leito padrão,
        // é o que acontece na linha de código abaixo:
        Scanner scanner = new Scanner(System.in);

        // Captura entrada do usuário
        System.out.println("Digite seu nome: ");

        // Lê a linha de texto e guarda o que foi digitado na variável.
        String firstName = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String lastName = scanner.nextLine();

        System.out.println(String.format("Nome completo: %s %s!", firstName, lastName));
    }
}
