package Animal_Zoo;

public class ZooAnimalXPTO {
    String tipo, apelido, idRegistro, origem, dataNascimento;

    public ZooAnimalXPTO() {
        tipo = "Desconhecida";
        apelido = "Criatura";
        idRegistro = "0000-0000";
        origem = "Indefinido";
        dataNascimento = "01/01/2000";
    }

    public ZooAnimalXPTO(String tipo, String apelido, String idRegistro, String origem, String dataNascimento) {
        this.tipo = tipo;
        this.apelido = apelido;
        this.idRegistro = idRegistro;
        this.origem = origem;
        this.dataNascimento = dataNascimento;
    }

    public void registrar(String tipo, String apelido, String idRegistro, String origem, String dataNascimento) {
        this.tipo = tipo;
        this.apelido = apelido;
        this.idRegistro = idRegistro;
        this.origem = origem;
        this.dataNascimento = dataNascimento;
        System.out.println("Animal registrado com sucesso!");
    }

    public void atualizar(String tipo, String apelido, String idRegistro, String origem, String dataNascimento) {
        this.tipo = tipo;
        this.apelido = apelido;
        this.idRegistro = idRegistro;
        this.origem = origem;
        this.dataNascimento = dataNascimento;
        System.out.println("Informações do animal atualizadas com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Animal:");
        System.out.println("-----------------------");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Apelido: " + this.apelido);
        System.out.println("ID Registro: " + this.idRegistro);
        System.out.println("Origem: " + this.origem);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println();
    }
}