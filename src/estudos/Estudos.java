package estudos;

/*
* Aprendizado sobre operadores e atribuição de variáveis
* operadores de atribuição = e +=, ==
* */

public class Estudos {
    public static void main(String[] args) {
        int a;
        int b;
        double comissao;
        double saldo;
        double valor;

        valor = 0;
        a = 110;
        b = 20;
        comissao = 0.5;
        saldo = a + b;
        saldo += comissao;
        valor += b;

        // Operadores aritméticos no Java
        double soma = a + b;
        double subtracao = a - b;
        double divisao = a / b;
        double multiplicacao = a * b;
        double restoDaDivisao = a % b;

        System.out.println(a + b); // Somando as variavies A e B
        System.out.println(a - b); // Subtraindo as variaveis A e B
        System.out.println(a * b); // Multiplicando as variaveis A e B
        System.out.println(a / b); // Dividindo as variaveis A e B
        System.out.println(a % b); // Tirando o resto da divisão entre A e B
        System.out.println(saldo);
        System.out.println(valor);


        soma();
    }

    static void soma() {
        int a;
        int b;
        double resultado;

        a = 10;
        b = 25;
        resultado = a + b;
        System.out.println(resultado);
    }
}
