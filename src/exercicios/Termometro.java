package exercicios;
/*
* Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
* 1. Utilize variáveis para representar os valores das temperaturas e
* 2. Imprima no console o valor convertido de Celsius para Fahrenheit.

Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
* Extra: crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
* Lembre-se que provavelmente você precisará fazer um casting de valores.
*
*/



public class Termometro {
    public static void main(String[] args) {
        System.out.println("<=== CONVERSOR DE TEMPERATURA ===>");

        double temperatureCelsius = 30.4;
        System.out.println(String.format("Cº : %.2f", temperatureCelsius));
        double temperatuteFahrenheit = (temperatureCelsius * 1.8 ) + 32;
        System.out.println(String.format("Fº : %.2f", temperatuteFahrenheit));

        int temperaturaFahrenheitSemDecimal = (int) temperatuteFahrenheit;
        System.out.println(String.format("Temperatura Fahrenheit sem casas decimais: %d",temperaturaFahrenheitSemDecimal));

    }
}
