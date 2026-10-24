public class StringsTextBlocks {
    public static void main(String[] args){
        String name = "Paulo Queiroz";
        String greeting = "Hello!";
        String message = "Welcome to your learn in Java.";

        System.out.println(name + " " + greeting + " " + message );

        // Fazendo comparação de Strings com Java
        // Podemos fazer uma compração utilizando um metodo chamado Equals()

        System.out.println("<-- FAZENDO COMPARAÇÃO DE STRINGS -->");
        String adminUsername = "admin";
        String adminPassword = "1234";

        //  temos duas formas de fazer uma comparação de string no Java
        // Forma padrão com if e else e passando as condicoes como == igual
        if (adminUsername == "admin" && adminPassword == "1234"){
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Você não tem acesso ao painel do administrador!");
        }

        // Temos também a outra forma, utilizando o metodo Equals() na variavel e passando como parametro a senha que o admin têm.

        if ( adminUsername.equals("admin") && adminPassword.equals("1234")){
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        // No Java, também temos uma peculiaridade que é o Text Block
        // Bem parecido com Python, basta usar """ no começo e """ no final do Text Block
        String textBlock = """
                Olá, mundo!
                Este aqui é um Text Block,
                Me permite fazer quebras de Linha com frases e textos,
                Igual aqui.
                """;

        // No Java, formatação de textos e números podem ser feitos de diversas maneiras. O que pode ser util em diversas situações.
        // Uma das maneiras mais comuns de formatar textos em Java é utilizando o metodo Format(), da classe String.
        // Esse metodo tem como funcao, formatar um texto utilizando placeholders
        // que estão sendo representados pelos caracteres %, seguindo uma letra que indica o tipo de dado que será inserido no placeholder.
        // Por exemplo, %s indica que uma String será inserida no Placeholder, %d indica um valor inteiro e %f indica um valor ponto flutuante.

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, tenho %d anos. Fui ao mercado fazer compras básicas e gastei R$ %f.", nome, idade, valor));
        // passamos as variaveis que serão formatadas no lugar de %, sendo %s para String, %d para inteiro e %f para double | ponto flutuante.

        nome = "João";
        int aulas = 4;
        message = """
                Oi meu nome é %s. 
                Sou estudante de Sistemas de Informação e dia de quinta-feira, 
                tenho %d aulas durante a manhã. :( 
                """.formatted(nome, aulas);

        System.out.println(message);
    }
}
