public class OperadoresIncrementadores {
    public static void main(){
        System.out.println("<-- APRENDENDO INCREMENTADOR no Java-->");

        /*
        *Além dos operadores citados anteriormente, o operador de incremento é usado para aumentar o valor de uma variável em
        * 1. Existem dois tipos de operadores de incremento:
        * o operador de pré-incremento (++variavel) e
        * o operador de pós-incremento (variavel++).

        O operador de pré-incremento (++variavel) aumenta o valor da variável em 1
        *  antes de usar a variável em uma expressão.
        * Aqui está um exemplo:
        * */
        int num = 5;
        int resultado = ++num; //Num é incrementado para 6 e depois atribuído ao resultado
        System.out.println(num); // Imprime 6
        System.out.println(resultado); // Imprime 6

        int num2 = 6; // Define o valor de num para 6
        int resultado2 = num2++; // num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2);  // Imprime 7 pois o que foi incrementado foi a variavel num2
        System.out.println(resultado2); // Imprime 6 pois a variavel resultado recebe a atribuição da variavel
        // quem é incrementado após o processo de atribuição, é o próprio num2
    }
}
