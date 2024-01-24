package aulas.aula_6.pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return "Nome: " + nome;
    }

    public void setNome(String novoNome){
        if(!nome.equals("")){
            nome = novoNome;
        }else{
            System.out.println("Nome inválido");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double novaAltura){
        if(novaAltura > 0){
            altura = novaAltura;
        }else{
            System.out.println("altura inválida");
        }
    }

    public String toString(){
        String res = "";
        res += "Nome: " + nome + "\n";
        res += "Altura: " + altura + "\n";
        return res;
    }


}
