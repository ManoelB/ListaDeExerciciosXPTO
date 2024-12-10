package Conta_Banco;

public class ContaXPTO {
    String titular, rg, cpf, numeroConta, numeroAgencia;
    double saldo;

    public ContaXPTO() {
        titular = "Cliente Padrão";
        rg = "00.000.000-00";
        cpf = "000.000.000-00";
        numeroConta = "000000-0";
        numeroAgencia = "0000";
        saldo = 0.0;
    }

    public ContaXPTO(String titular, String rg, String cpf, String numeroConta,
                     String numeroAgencia, double saldo) {
        this.titular = titular;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void registrar(String titular, String rg, String cpf, String numeroConta,
                          String numeroAgencia, double saldo) {
        this.titular = titular;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        System.out.println("Conta registrada com sucesso!");
    }

    public void atualizar(String titular, String rg, String cpf, String numeroConta,
                          String numeroAgencia, double saldo) {
        this.titular = titular;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        System.out.println("Dados da conta atualizados com sucesso!");
    }

    public void exibirSaldo() {
        System.out.println("O saldo atual é: R$ " + this.saldo);
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Agência: " + this.numeroAgencia);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}