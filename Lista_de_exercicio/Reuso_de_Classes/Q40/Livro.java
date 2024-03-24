package Lista_de_exercicio.Reuso_de_Classes.Q40;

public class Livro {
    private int idLivro;
    private String nome;
    private String autor;
    private int quantidadeDePaginas;
    private int anoDeLancamento;


    public Livro(int idLivro, String nome, String autor, int quantidadeDePaginas, int anoDeLancamento) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.quantidadeDePaginas = quantidadeDePaginas;
        this.anoDeLancamento = anoDeLancamento;
    }


    @Override
    public String toString() {
        return "Livro #" + idLivro + "\nnome: " + nome + "\nautor: " + autor + "\nquantidadeDePaginas: "
                + quantidadeDePaginas + "\nanoDeLancamento: " + anoDeLancamento;
    }
}