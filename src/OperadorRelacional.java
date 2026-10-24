public class OperadorRelacional {
    public static void main(){
        String message = "<-- APRENDENDO SOBRE OPERADORES RELACIONAIS -->";
        System.out.println(message);
        // Definindo as variavies do tipo inteiro
        int a;
        int b;
        int c;

        // Atribuindo os valores as variaveis declaradas
        a = 5;
        b = 15;
        c = 30;

        // Verificando os valores com operadores relacionais
        boolean igual = (b == a);
        System.out.println(igual);
        boolean diferente = ( a != b);
        System.out.println(diferente);
        boolean maior = (a > b);
        System.out.println(maior);
        boolean maiorIgual = (a >= b);
        System.out.println(maiorIgual);
        boolean menor = (a < b);
        System.out.println(menor);
        boolean menorIgual = (a <= b);
        System.out.println(menorIgual);

        if ( 2 * b == c) {
            System.out.println("15 multiplicado por 2 é igual a 30");
        } else {
            System.out.println("O resultado de 2 * b não é igual a 30");
        }

        boolean first = true;
        boolean last = false;

        // && é a porta and, ou seja, quando as duas variáveis tem valor true.
        if (first && last ){
            // Esse código não será executado, já que first é verdadeiro e last é false
            System.out.println("As duas condições são verdadeiras.");
        } else if (first || last) {
            System.out.println("Uma das duas condições é verdadeira.");
        } else {
            System.out.println("Não há condição verdadeira.");
        }

        if ( !first ){
            System.out.println("Esse código não será executado, pois a condição é verdadeira");
        }
    }
}
