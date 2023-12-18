package aula_5.faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;

    public void inicializaRegistroAcademico(String nome, String matricula, int codigo, double percentualDeCobranca){
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigo;
        this.percentualDeCobranca = percentualDeCobranca;
    }

    public double calculaMensalidade(){
        return 100 * this.codigoCurso * this.percentualDeCobranca;
    }
}
