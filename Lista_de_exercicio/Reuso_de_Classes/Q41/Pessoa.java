package Lista_de_exercicio.Reuso_de_Classes.Q41;

public class Pessoa {
    private String nome;
    private String cpf;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\ncpf: " + cpf;
    }
}
