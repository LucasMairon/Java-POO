package Lista_de_exercicio.Reuso_de_Classes.Q42;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
