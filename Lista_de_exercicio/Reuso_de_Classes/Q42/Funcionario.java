package Lista_de_exercicio.Reuso_de_Classes.Q42;

public class Funcionario {
    private String nome;
    private double salario;

    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public void ganhoAnual(){
        double salarioAnual = salario * 12;
        double decimoTerceiro = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
