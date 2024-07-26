import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double totalNotas = 0;
        double nota = 0;

//        FOR
        // sintaxe do for (inicialização; condição; incremento)
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            totalNotas += nota;
        }

        double mediaNotas = totalNotas / 3;

        System.out.println(String.format("A média das notas é: %.2f", mediaNotas));

//        WHILE
        int menu = 0;
        while (menu != -1){
            System.out.println("Digite 1-9 para continuar ou -1 para sair");
            menu = leitura.nextInt();
        }

    }
}
