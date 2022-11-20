package pacote1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b;

            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            b = scan.nextInt();

            int soma = soma(a,b);
            int subtracao = subtracao(a,b);
            int multiplicacao = multiplicacao(a,b);
            float divisao = divisao(a,b);

            System.out.println("Adição = " + soma + "\n");
            System.out.println("Subtração = " + subtracao + "\n");
            System.out.println("Multiplicação = " + multiplicacao + "\n");
            System.out.println("Divisao = " + divisao);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    public static float divisao(int a, int b) {
        return a / b;
    }
}
