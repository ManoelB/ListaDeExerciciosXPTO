package Carro_Empresa;

public class CarroXPTOApp {
    public static void main(String[] args) {
        CarroXPTO veiculo1 = new CarroXPTO();
        CarroXPTO veiculo2 = new CarroXPTO("Modelo X", "ID1234", "Fabricante X",
                "Branco", "Elétrico", "Sim", 20000.00,
                2025, 4, 3);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrar("Modelo Z", "ID5678", "Fabricante Z", "Azul", "Híbrido", "Não", 15000.00, 2026, 5, 10);
        veiculo2.registrar("Modelo Y", "ID9012", "Fabricante Y", "Vermelho", "Diesel", "Sim", 18000.00, 2023, 3, 7);

        System.out.println();

        veiculo1.exibirDetalhes();
        System.out.println();
        veiculo2.exibirDetalhes();

        veiculo1.atualizar("Modelo Modificado", "ID0001", "Fabricante Alterado", "Cinza", "Gasolina", "Sim", 12000.00, 2022, 2, 15);
        veiculo2.atualizar("Modelo Atualizado", "ID3456", "Fabricante Novo", "Preto", "Etanol", "Não", 25000.00, 2021, 4, 20);

        System.out.println();

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}