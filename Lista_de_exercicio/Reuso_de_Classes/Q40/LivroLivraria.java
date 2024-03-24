package Lista_de_exercicio.Reuso_de_Classes.Q40;

public class LivroLivraria extends Livro{
    private double preco;

    public LivroLivraria(int idLivro, String nome, String autor, int quantidadeDePaginas, int anoDeLancamento,
            double preco) {
        super(idLivro, nome, autor, quantidadeDePaginas, anoDeLancamento);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + "\npreco: " + preco + "\n";
    }
}
