import java.util.Scanner;

public class DesafioPraticoFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Desafio 1
        System.out.println("Desafio 1");
        System.out.println("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        if(numeroDigitado >= 0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }


//        Desafio 2
        System.out.println("Desafio 2");
        System.out.println("Digite um número qualquer: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número qualquer: ");
        int numeroDois = scanner.nextInt();
        if(numeroUm > numeroDois){
            System.out.println("O número " + numeroUm + " é maior que " + numeroDois);
        } else if(numeroDois > numeroUm){
            System.out.println("O número " + numeroDois + " é maior que " + numeroUm);
        } else {
            System.out.println("Os números são iguais");
        }

//        Desafio 3
        System.out.println("Desafio 3");
        System.out.println("Escolha 1 para calcular área do quadro ou 2 para calcular área do círculo: ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("A área do quadrado é: " + area);
        } else if (escolha == 2) {
            System.out.println("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo é: " + area);
        } else {
            System.out.println("Opção inválida");
        }
//        Desafio 4
        System.out.println("Desafio 4");
        System.out.println("Escolha um numéro e exibiremos a tabuada de 1 a 10: \n");
        int numeroATabuar = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numéro " + numeroATabuar + "x" + i +" = " + numeroATabuar * i);
        }

//        Desafio 5
        System.out.println("Desafio 5");
        System.out.println("Digite um número, adivinharemos se é par ou ímpar: ");
        int numeroParImpar = scanner.nextInt();
        if(numeroParImpar % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

//        Desafio 6
        System.out.println("Desafio 6");
        System.out.print("Digite um número: ");
        int numeroDigitadoFatorial = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitadoFatorial; i++) {
            fatorial *= i;
            System.out.println(numeroDigitadoFatorial + " * " + i);

        }
            System.out.println("O fatorial de " + numeroDigitadoFatorial + " é: " + fatorial);




    }

}
