package Carro_Empresa;

public class CarroXPTO {
    String modelo, identificador, fabricante, cor, tipoCombustivel, possuiComplementos;
    double preco;
    int anoFabricacao, quantidadePortas, quantidadeDisponivel;

    public CarroXPTO() {
        modelo = "Padrão A";
        identificador = "ID0000";
        fabricante = "Fabricante A";
        cor = "Preto";
        tipoCombustivel = "Gasolina";
        possuiComplementos = "Sim";
        preco = 12000.00;
        anoFabricacao = 2024;
        quantidadePortas = 4;
        quantidadeDisponivel = 2;
    }

    public CarroXPTO(String modelo, String identificador, String fabricante, String cor,
                     String tipoCombustivel, String possuiComplementos, double preco,
                     int anoFabricacao, int quantidadePortas, int quantidadeDisponivel) {
        this.modelo = modelo;
        this.identificador = identificador;
        this.fabricante = fabricante;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.possuiComplementos = possuiComplementos;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Complementos disponíveis? " + this.possuiComplementos);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Quantidade de Portas: " + this.quantidadePortas);
        System.out.println("Disponível em Estoque: " + this.quantidadeDisponivel);
    }

    public void registrar(String modelo, String identificador, String fabricante, String cor,
                          String tipoCombustivel, String possuiComplementos, double preco,
                          int anoFabricacao, int quantidadePortas, int quantidadeDisponivel) {
        this.modelo = modelo;
        this.identificador = identificador;
        this.fabricante = fabricante;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.possuiComplementos = possuiComplementos;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeDisponivel = quantidadeDisponivel;
        System.out.println("Veículo registrado com sucesso!");
    }

    public void atualizar(String modelo, String identificador, String fabricante, String cor,
    String tipoCombustivel, String possuiComplementos, double preco, int anoFabricacao, int quantidadePortas,
    int quantidadeDisponivel) {
        this.modelo = modelo;
        this.identificador = identificador;
        this.fabricante = fabricante;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.possuiComplementos = possuiComplementos;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.quantidadePortas = quantidadePortas;
        this.quantidadeDisponivel = quantidadeDisponivel;
        System.out.println("Informações do veículo atualizadas com sucesso!");
    }
}