public class ScreenMatch {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
            System.out.println("Filme: Top Gun Maverick");

            int anoDeLancamento;
            anoDeLancamento = 2022;
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
            boolean inclusoNoPlano = true;
            double notaDoFilme = 8.79;
            double media = (9 + 8.89 + 6.80) / 3;

            notaDoFilme = (int) (media / 2);
            System.out.printf("O filme tem %s estrelas de avaliação média.%n", notaDoFilme);
    }
}