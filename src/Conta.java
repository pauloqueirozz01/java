/* A orientação a objetos se dá pela criação de classes e objetos
* Por exemplo, para entender melhor:
* a classe Conta pode ter uma instância criada de contaPaulo, que é um Objeto da Classe Conta.
* Conta contaPaulo = new Conta();
*
*
* */

class Conta {
    String titular;
    double saldo;
    boolean ativa;

    public static void main(String[] args) {
        Conta contaPaulo = new Conta();
        contaPaulo.titular = "Paulo Queiroz";
        contaPaulo.saldo = 250;
        contaPaulo.ativa = true;
    }
}