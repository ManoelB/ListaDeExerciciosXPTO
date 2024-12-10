package Calculadora;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ProgramaCalculadora calc = new ProgramaCalculadora();
        int opcao;

        System.out.println("=========================================");
        System.out.println("       Bem-vindo à Calculadora XPTO!");
        System.out.println("=========================================");

        try {
            System.out.print("Informe o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.print("Informe o segundo número: ");
            int num2 = teclado.nextInt();

            do {
                System.out.println("\nESCOLHA UMA OPERAÇÃO:");
                System.out.println("-------------------------");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                System.out.print("Sua escolha: ");
                opcao = teclado.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da soma: " + calc.soma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado da subtração: " + calc.subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado da multiplicação: " + calc.multiplicacao(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado da divisão: " + calc.divisao(num1, num2));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida!");
                        }
                        break;
                    case 5:
                        System.out.println("Saindo... Obrigado por usar a Calculadora XPTO!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }
            } while (opcao != 5);

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            teclado.close();
        }
    }
}