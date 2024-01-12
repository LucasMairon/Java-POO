package Lista_de_exercicio.Criacao_de_classes.Q31;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoDoCurso;
    double percentualDeCobranca;
    static int numeroDeMatriculas;

    public RegistroAcademico(String nome, int codigoDoCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
        numeroDeMatriculas++;
        matricula = "" + numeroDeMatriculas;
    }

    @Override
    public String toString() {
        return "nome do aluno: " + nome + "\n" + "codigo do curso: " + codigoDoCurso + "\n" + "numero da matricula: " + matricula + "\n";
    }

    
}
