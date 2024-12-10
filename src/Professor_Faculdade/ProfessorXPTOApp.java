package Professor_Faculdade;

public class ProfessorXPTOApp {
    public static void main(String[] args) {
        ProfessorXPTO prof1 = new ProfessorXPTO();
        ProfessorXPTO prof2 = new ProfessorXPTO("DrJoão Silva", "Doutorado", "UFBA", "Cálculo e Física", 40, 8500.00);

        System.out.println("** Professores cadastrados inicialmente **");
        prof1.exibirInformacoesProfessor();
        prof2.exibirInformacoesProfessor();

        System.out.println("** Cadastro de novos profess*");
        prof1.cadastrarProfessor("Prof. Ana Paula", "Mestrado", "USP", "Programação e Algoritmos", 30, 7000.00);
        prof2.cadastrarProfessor("Dr. Carlos Alberto", "Pós-Doutorado", "UNICAMP", "IA e Machine Learning", 20, 12000.00);

        System.out.println("\n** Após o cadastro **");
        prof1.exibirInformacoesProfessor();
        prof2.exibirInformacoesProfessor();
        System.out.println("** Atualização de dados dos professores **");
        prof1.atualizarDadosProfessor("Prof. Ana Paula Silva", "Mestrado", "USP", "Java Avançado e Python", 35, 7500.00);
        prof2.atualizarDadosProfessor("Dr. Carlos Alberto Lima", "Pós-Doutorado", "UNICAMP", "Deep Learning e Redes Neurais", 25, 13000.00);

        System.out.println("\n** Dados atualizaos **");
        prof1.exibirInformacoesProfessor();
        prof2.exibirInformacoesProfessor();
    }
}