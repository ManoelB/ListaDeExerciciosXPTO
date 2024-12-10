package Funcionario_Empresa;

public class FuncionarioXPTOApp {
    public static void main(String[] args) {
        FuncionarioXPTO funcionario1 = new FuncionarioXPTO();
        FuncionarioXPTO funcionario2 = new FuncionarioXPTO("Cicrano Silva", "15/07/1985",
                "12.345.678-9", "123.456.789-00", "Rua das Palmeiras, 123, São Paulo - SP",
                "São Palo - SP", "Engenheiro de Software", "Ensino Superior Completo",
                "2023456789", 7500.00);

        System.out.println("** Funcionários cadastrados inicialmente **");
        funcionario1.exibirInfoFuncionario();
        funcionario2.exibirInfoFuncionario();

        System.out.println("** Castro de novos funcionários **");
        funcionario1.cadastrarFuncionario("João Carlos", "10/05/1990", "98.765.432-1", "987.654.321-00",
                "Avenida Central, 456, Salvador - BA", "Salvador - BA", "Analista Financeiro",
                "Ensino Superior Completo", "3039876543", 6800.00);

        System.out.println("\n** Após o cadastro **");
        funcionario1.exibirInfoFuncionario();
        funcionario2.exibirInfoFuncionario();

        System.out.println("** Aualização de dados dos funcionários **");
        funcionario2.alterarInfoFuncionario("Ana Paula", "20/08/1992", "76.543.210-9", "765.432.109-88",
                "Rua das Laranjeiras, 789, Recife - PE", "Recife - PE", "Gerente de Projetos",
                "Pós-graduação Completa", "5098765432", 8500.00);

        System.out.println("\n** Dados atualizados **");
        funcionario1.exibirInfoFuncionario();
        funcionario2.exibirInfoFuncionario();
    }
}