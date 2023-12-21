package aula_5.faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegistroAcademico(String nome, String matricula, int codigo, double percentualDeCobranca){
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigo;
        this.percentualDeCobranca = percentualDeCobranca;
    }

    public double calculaMensalidade(){
        return 100 * this.codigoCurso * this.percentualDeCobranca;
    }
    
    public String getMatricula() {
        return matricula;
    }

}
