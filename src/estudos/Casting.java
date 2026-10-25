package estudos;

/*
* Casting é a conversão de um valor de um tipo primitivo para outro.
* Existem duas formas:
*
* - Casting IMPLÍCITO (widening / alargamento): o Java faz sozinho quando o tipo de destino
*   é "maior" que o de origem, ou seja, cabe o valor inteiro sem perder nada.
*   byte -> short -> int -> long -> float -> double
*                char -> int
*
* - Casting EXPLÍCITO (narrowing / estreitamento): quando o tipo de destino é "menor",
*   o Java não converte sozinho, porque pode haver perda de informação.
*   Precisamos escrever o tipo entre parênteses: (int), (byte), (long)...
* */

public class Casting {
    public static void main(String[] args){
        System.out.println("<-- APRENDENDO SOBRE CASTING IMPLÍCITO -->");

        int idade = 25;
        long idadeLong = idade;     // int cabe em long, conversão automática
        double idadeDouble = idade; // int cabe em double, conversão automática
        System.out.println(idadeLong);   // Imprime 25
        System.out.println(idadeDouble); // Imprime 25.0

        // char também é convertido para int sozinho: o valor é o código da letra na tabela Unicode
        char letra = 'A';
        int codigoDaLetra = letra;
        System.out.println(codigoDaLetra); // Imprime 65

        // Em contas, o Java "promove" o resultado para o maior tipo envolvido
        int quantidade = 3;
        double preco = 2.5;
        double total = quantidade * preco; // quantidade vira double antes da multiplicação
        System.out.println(total); // Imprime 7.5

        System.out.println("<-- APRENDENDO SOBRE CASTING EXPLÍCITO -->");

        // double -> int: a parte decimal é DESCARTADA, não arredondada
        double nota = 9.99;
        int notaInteira = (int) nota;
        System.out.println(notaInteira); // Imprime 9, e não 10

        // Para arredondar de verdade, usamos Math.round() antes do casting
        int notaArredondada = (int) Math.round(nota);
        System.out.println(notaArredondada); // Imprime 10

        // int -> char: o caminho contrário do exemplo da letra
        int codigo = 66;
        char outraLetra = (char) codigo;
        System.out.println(outraLetra); // Imprime B

        // Cuidado: se o valor não cabe no tipo menor, ele "dá a volta" (overflow)
        // byte vai de -128 a 127, então 200 não cabe
        int numeroGrande = 200;
        byte numeroByte = (byte) numeroGrande;
        System.out.println(numeroByte); // Imprime -5   6

        long populacao = 3_000_000_000L; // maior que o limite do int (cerca de 2,1 bilhões)
        int populacaoInt = (int) populacao;
        System.out.println(populacaoInt); // Imprime -1294967296

        System.out.println("<-- CASTING NA DIVISÃO -->");

        // Divisão entre dois int descarta a parte decimal, mesmo guardando em double
        int a = 7;
        int b = 2;
        double divisaoErrada = a / b;
        double divisaoCerta = (double) a / b;  // a vira 7.0 antes da conta, então 7.0 / 2 = 3.5
        System.out.println(divisaoErrada); // Imprime 3.0
        System.out.println(divisaoCerta);  // Imprime 3.5

        // A posição dos parênteses muda o resultado:
        double divisaoAindaErrada = (double) (a / b); // a conta 7 / 2 acontece primeiro, dando 3
        System.out.println(divisaoAindaErrada); // Imprime 3.0
    }
}
