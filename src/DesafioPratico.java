public class DesafioPratico {
    public static void main(String [] args) {
        System.out.println("Desafio prático");

        //1 - Desafio prático
        double nota = 7.5;
        int notaArredondada = (int) nota;
        System.out.println("A nota arredondada é " + notaArredondada);

        //2 - Desafio prático
        char letra = 'A';
        String palavra = "Java";

        System.out.println(String.format("Temos a letra %c e a palavra %s", letra, palavra));

        //3 - Desafio prático
        double valorEmDolares = 10;
        double valorEmReais = valorEmDolares * 5.67;
        System.out.println("O valor em reais é " + valorEmReais);

        //4 - Desafio prático
        double precoOriginal = 150.12;
        double percentualDesconto = 20;
        double valorDoDesconto = precoOriginal * (percentualDesconto/100);
        double valorFinal = precoOriginal - valorDoDesconto;

        System.out.println("O valor original é: " + precoOriginal + " e com desconto é " + valorFinal);
    }
}
