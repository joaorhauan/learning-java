package edu.sintaxe;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in, "CP850");
        int valorFinal, n1, n2;

        System.out.println("Bem-vindo à calculadora! Que operação desejas realizar? (soma, subtração, multiplicação, divisão)");
        String operacao = myScanner.nextLine();
        System.out.println(operacao);

        System.out.println("Certo! agora digite o primeiro número da operação:");
        n1 = myScanner.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = myScanner.nextInt();

        if (operacao.equals("soma")){
            valorFinal = somar(n1,n2);
        } else if (operacao.equals("subtração")) {
            valorFinal = subtrair(n1,n2);
        } else if (operacao.equals("multiplicação")) {
            valorFinal = multiplicar(n1, n2);
        } else if (operacao.equals("divisão")) {
            if (n2 == 0) {
                throw new ArithmeticException("Impossível dividir por 0");
            }
            valorFinal = dividir(n1, n2);
        } else {
            throw new Exception("Operação inválida! Execute novamente e digite uma operação corretamente.");
        }
            
        System.out.println("O valor da sua operação é de " + valorFinal);
    }

    public static int somar(int x, int y) {
        return x + y;
    }

    public static int subtrair(int x, int y) {
        return x - y;
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static int dividir(int x, int y) {
        return x / y;
    }
}