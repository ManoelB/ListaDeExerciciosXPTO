package Professor_Faculdade;

public class ProfessorXPTO {
    String nome, titulacao, formacao, disciplinas;
    int cargaHoraria;
    double salario;

    public ProfessorXPTO() {
        nome = "Não informado";
        titulacao = "Não especificada";
        formacao = "Não especificada";
        disciplinas = "Nenhuma atribuída";
        cargaHoraria = 0;
        salario = 0.0;
    }

    public ProfessorXPTO(String nome, String titulacao, String formacao, String disciplinas, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void cadastrarProfessor(String nome, String titulacao, String formacao, String disciplinas, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void atualizarDadosProfessor(String nome, String titulacao, String formacao, String disciplinas, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("Dados do professor atualizados com sucesso!");
    }

    public void exibirInformacoesProfessor() {
        System.out.println("Informações do Professor:");
        System.out.println("--------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Disciplinas atribuídas: " + this.disciplinas);
        System.out.println("Carga Horária Semanal: " + this.cargaHoraria + " horas");
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
        System.out.println();
    }
}