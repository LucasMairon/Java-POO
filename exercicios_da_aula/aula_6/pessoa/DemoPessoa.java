package aulas.aula_6.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao Maria", 1.67);
        pessoa.setAltura(1.68);
        System.out.println(pessoa.toString());

    }
}
