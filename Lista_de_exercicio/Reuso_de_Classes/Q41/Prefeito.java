package Lista_de_exercicio.Reuso_de_Classes.Q41;

public class Prefeito extends Politico{
    private String cidadeEmQueGoverna;

    public Prefeito(String nome, String cpf, String partidoPolitico, String cidadeEmQueGoverna) {
        super(nome, cpf, partidoPolitico);
        this.cidadeEmQueGoverna = cidadeEmQueGoverna;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncidade em que é prefeito: " + cidadeEmQueGoverna;
    }
}
