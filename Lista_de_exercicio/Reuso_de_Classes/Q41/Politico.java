package Lista_de_exercicio.Reuso_de_Classes.Q41;

public class Politico extends Pessoa {
    private String partidoPolitico;

    public Politico(String nome, String cpf, String partidoPolitico) {
        super(nome, cpf);
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPartido: " + partidoPolitico;
    }
}
