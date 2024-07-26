import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
    // 1. Declare uma variável do tipo Scanner e inicialize-a com o método System.in
        Scanner leitura = new Scanner(System.in);

    // 2. Imprima a mensagem "Digite seu nome: "
        System.out.println("Digite seu filme favorito: ");

    // 3. A função do nextline é
        String filme = leitura.nextLine();

    // 4. Imprima a mensagem "Seu nome é: " concatenada com a variável do tipo String
        System.out.println(filme);

//        Outro teste

        System.out.println("Qual o ano de lançamento?");
        int ano = leitura.nextInt();
        System.out.println(ano);
        System.out.println("De sua nota ao filme: ");
        double nota = leitura.nextDouble();

        System.out.println("O filme " + filme + " foi lançado em " + ano + " e você deu a nota " + nota);
    }
}
