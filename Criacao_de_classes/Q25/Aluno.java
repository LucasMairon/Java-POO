package Criacao_de_classes.Q25;

import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double notaDoTrabalho;

    public Aluno(String nome, int matricula, double nota1, double nota2, double notaDoTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaDoTrabalho = notaDoTrabalho;
    }

    public double media(){
        return ((2.5 * this.nota1) + (2.5 * this.nota2) + (2 * this.notaDoTrabalho))/7;
    }

    public String provaFinal(){
        double mediaAluno = this.media();
        if(mediaAluno < 3 || mediaAluno >= 7){
            return "Aprovado";
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a nota no exame final");
        double notaExameFinal = scan.nextDouble();
        double mediaFinal = (mediaAluno * 6 + notaExameFinal * 4)/10;
        if(mediaFinal >= 5){
            scan.close();
            return "Aprovado";
        }
        scan.close();
        return "Reprovado";
    }

    @Override
    public String toString() {
        return "nome do aluno: " + this.nome + "\n" + "matricula do aluno: " + this.matricula + "\n" + "media do aluno: " + media() + "\n";
    }








}
