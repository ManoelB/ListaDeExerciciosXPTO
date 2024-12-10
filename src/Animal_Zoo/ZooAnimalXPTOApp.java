package Animal_Zoo;

public class ZooAnimalXPTOApp {
    public static void main(String[] args) {
        ZooAnimalXPTO animal1 = new ZooAnimalXPTO();
        ZooAnimalXPTO animal2 = new ZooAnimalXPTO("Mamífero", "Luna", "A123-456", "Floresta Tropical", "15/03/2021");

        animal1.exibirInformacoes();
        animal2.exibirInformacoes();

        animal1.registrar("Réptil", "Spike", "B789-101", "Pantanal", "10/07/2018");
        animal2.registrar("Ave", "Blue", "C234-567", "Mata Atlântica", "05/05/2022");
        System.out.println();

        animal1.exibirInformacoes();
        System.out.println();
        animal2.exibirInformacoes();
        System.out.println();

        animal1.atualizar("Amfibio", "Sal", "D890-123", "Amazônia", "20/02/2020");
        animal2.atualizar("Mamífero", "Shadow", "E345-678", "Savanas", "25/12/2015");
        System.out.println();

        animal1.exibirInformacoes();
        System.out.println();
        animal2.exibirInformacoes();
    }
}
