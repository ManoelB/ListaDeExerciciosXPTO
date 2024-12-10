package Funcionario_Empresa;

public class FuncionarioXPTO {
    String nome, dataNascimento, RG, CPF, endereco, naturalidade, profissao, grauInstrucao, matricula;
    double salario;

    public FuncionarioXPTO() {
        nome = "Não informado";
        dataNascimento = "Não informado";
        RG = "Não informado";
        CPF = "Não informado";
        endereco = "Não informado";
        naturalidade = "Não informado";
        profissao = "Não informado";
        grauInstrucao = "Não informado";
        matricula = "Não informado";
        salario = 0.0;
    }

    public FuncionarioXPTO(String nome, String dataNascimento, String RG, String CPF, String endereco,
                           String naturalidade, String profissao, String grauInstrucao, String matricula, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
    }
    public void cadastrarFuncionario(String nome, String dataNascimento, String RG, String CPF, String endereco,
                                     String naturalidade, String profissao, String grauInstrucao, String matricula, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void alterarInfoFuncionario(String nome, String dataNascimento, String RG, String CPF, String endereco,
                                       String naturalidade, String profissao, String grauInstrucao, String matricula, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
        System.out.println("Dados do funcionário alterados com sucesso!");
    }

    public void exibirInfoFuncionario() {
        System.out.println("Informações do Funcionário:");
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("RG: " + RG);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println();
    }
}