package Conta_Banco;

public class ContaXPTOApp {
    public static void main(String[] args) {
        ContaXPTO conta1 = new ContaXPTO();
        ContaXPTO conta2 = new ContaXPTO("João Silva", "12.345.678-9", "123.456.789-00",
                "12345-6", "9876", 500.0);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta1.registrar("Maria Santos", "23.456.789-0", "234.567.890-11",
                "54321-0", "1234", 1000.0);
        conta2.registrar("Carlos Almeida", "34.567.890-1", "345.678.901-22",
                "67890-1", "5678", 1500.0);

        System.out.println();
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();

        conta1.atualizar("Ana Pereira", "45.678.901-2", "456.789.012-33",
                "98765-4", "4321", 2000.0);
        conta2.atualizar("Luiz Oliveira", "56.789.012-3", "567.890.123-44",
                "12345-7", "8765", 2500.0);

        System.out.println();
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
    }
}