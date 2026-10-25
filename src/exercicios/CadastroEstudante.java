package exercicios;
import java.util.Scanner;

/*
Você foi contratado para desenvolver a primeira funcionalidade de um sistema de cadastro de estudantes chamado CadastroEstudante.

Nesta primeira versão, o sistema funcionará exclusivamente pelo terminal e deverá permitir que os dados do aluno sejam inseridos pelo terminal.
Após a coleta, o programa deverá exibir um resumo das informações cadastradas.
* */

public class CadastroEstudante {
    public static void main(String[] args){
        System.out.println("""
                ===== REGISTRA ALUNO =====
                
                *** BEM VINDO AO SISTEMA DE CADASTRO DE ESTUDANTES! ***
                
                """);
        // Iniciando o Scanner na aplicação
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nomeEstudante = scanner.nextLine();

        // Capturando a idade do estudante e convertendo a variavel String para virar um Int com metodo parseInt
        System.out.println("Digite a idade do estudante: ");
        String idadeDigitada = scanner.nextLine();
        int idadeEstudante = Integer.parseInt(idadeDigitada);

        // Capturando as notas do Estudante e também fazendo o processo da conversão da entrada String e convertendo o tipo para double.
        // foi armazenado o Texto em notaDigitada e o double convertido em notaEstudante.
        System.out.println("Digite a primeira nota de estudante: ");
        String notaDigitada1 = scanner.nextLine();
        double notaEstudante1 = Double.parseDouble(notaDigitada1);

        System.out.println("Digite a segunda nota de estudante: ");
        String notaDigitada2 = scanner.nextLine();
        double notaEstudante2 = Double.parseDouble(notaDigitada2);

        System.out.println("Digite a terceira nota de estudante: ");
        String notaDigitada3 = scanner.nextLine();
        double notaEstudante3 = Double.parseDouble(notaDigitada3);

        System.out.println("Deseja calcular a média das notas do estudante? (Digite S ou N)");
        String resposta = scanner.nextLine();

        System.out.println("Resposta capturada: [" + resposta + "]");
        System.out.println("Tamanho: " + resposta.length());

        // Caso a resposta seja com "S" | "s", ainda entra na condição do If e mostra o resultado.
        if (resposta.equalsIgnoreCase("s")){
            System.out.println("OK, iremos calcular a médias das notas do Aluno %s!".formatted(nomeEstudante));
            double media = (notaEstudante1 + notaEstudante2 + notaEstudante3) / 3;

            String resultado = """
                === RESULTADO ===
                Nome: %s
                Idade: %d anos
                Notas: %f, %f, %f
                Media: %f.
                
                """.formatted(nomeEstudante, idadeEstudante, notaEstudante1, notaEstudante2, notaEstudante3, media);

            System.out.println(resultado);
        } else {
            System.out.println("OK, estamos encerrando o programa!");
        }
    }

    // Para realizar o exercicio foi necessário o uso de uma variavel para armazenar a entrada do usuario e outra para converter o tipo do dado.
    // Nesse caso, decidi implementar esse estilo de captura de entrada do usuario me baseando que poderia haver textos nas entradas de
    // double ou int, mesmo usando o Scanner.nextDouble() a entrada não era capturada corretamente
}
