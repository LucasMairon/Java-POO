package Lista_de_exercicio.Reuso_de_Classes.Q41;

public class Governador extends Politico{
    private String estadoEmQueGoverna;

    public Governador(String nome, String cpf, String partidoPolitico, String estadoEmQueGoverna) {
        super(nome, cpf, partidoPolitico);
        this.estadoEmQueGoverna = estadoEmQueGoverna;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstado em que é governador: " + estadoEmQueGoverna;
    }

    
}
