package Lista_de_exercicio.Abstracts_polimorfismo_interface.Q47;

public interface ItemDeBiblioteca {
    public int maximoDeDiasParaEmprestimo = 14;

    public boolean estaEmprestado();

    public void empresta();

    public void devolve();

    public String localizacao();

    public String descricao();
}
