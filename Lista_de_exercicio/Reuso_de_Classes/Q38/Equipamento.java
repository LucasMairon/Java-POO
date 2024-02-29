package Lista_de_exercicio.Reuso_de_Classes.Q38;

public class Equipamento {
    private String nome;
    private String tipo;
    
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Tipo: " + tipo + "\n";
    }
}
