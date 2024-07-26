public class Estudos {
    public static void main(String [] args) {
        System.out.println("Anotações gerais de estudos");


        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2002;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFime = 8.00;
        String nomeDoFilme = "Top Gun: Maverick";

        //média calculada pelas 4 notas
        double media = (9.8 + 6.3 + 7.5 + 8.9) / 4;
        System.out.println(media);

        /*
            Comentário de bloco
            Comentário de bloco
            Comentário de bloco
         */

//        Comparação de strings
        String senha = "123456";
        if (senha.equals(("123456"))) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

//        Comparação string ignore case
        String nome = "Andre";
        if (nome.equalsIgnoreCase("andre")) {
            System.out.println("O nome está correto");
        } else {
            System.out.println("O nome está incorreto");
        }

//        Formatação de strings

        String nomeMae = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

//        Casting explicito
        int classificacao = (int) (valor);

        System.out.println("A classificação do filme é: " + classificacao);

        char a = 'b';
        int valorChar = (int) a;
        System.out.println("O valor do char é: " + valorChar);
    }
}
