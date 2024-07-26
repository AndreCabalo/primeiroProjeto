import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int tentativasMaxima = 5;
        //numero aleatório entre 0 e 100
        int numeroSecreto = new Random().nextInt(101);



        for(int tentativaAtual = 0; tentativaAtual < tentativasMaxima; tentativaAtual++) {
            System.out.println("Digite um número entre 0 e 100, tentativa número :" + tentativaAtual);
            int numeroDigitado = scanner.nextInt();
            if(numeroDigitado == numeroSecreto){
                System.out.println("Parabéns, você acertou o número secreto: " + numeroSecreto);
                break;
            } else if(numeroDigitado > numeroSecreto){
                System.out.println("O número secreto é menor que " + numeroDigitado);
            } else {
                System.out.println("O número secreto é maior que " + numeroDigitado);
            }

            if(tentativaAtual == tentativasMaxima - 1){
                System.out.println("Suas tentativas acabaram, o número secreto era: " + numeroSecreto);
        }
        }


    }
}
