package Lista_de_exercicio.Abstracts_polimorfismo_interface.Q44;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioPorHora;

    public Funcionario(String nome){
        salarioPorHora = 2.00;
        cargo = "Atendente";
    }

    public Funcionario(String nome, String cargo, double salarioPorHora){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.cargo = cargo;
    }

    public String toString(){
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalario p/hora: " + salarioPorHora;
    }
}
