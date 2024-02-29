package Lista_de_exercicio.Array_e_ArrayLists.Q35;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n" + "Cliente " + id + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Telefone: " + telefone + "\n";
    }

    
}
