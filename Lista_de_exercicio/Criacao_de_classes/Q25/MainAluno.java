package Lista_de_exercicio.Criacao_de_classes.Q25;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.print("digite a matricula do aluno: ");
        int matricula = scan.nextInt();
        System.out.println("digite a primeira e segunda nota do aluno: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        System.out.print("digite a nota no trabalho: ");
        double notaTrabalho = scan.nextDouble();
        Aluno aluno = new Aluno(nome,matricula,nota1,nota2,notaTrabalho);
        System.out.println(aluno);
        System.out.println("Situação do aluno: " + aluno.provaFinal()); 
    }
}
