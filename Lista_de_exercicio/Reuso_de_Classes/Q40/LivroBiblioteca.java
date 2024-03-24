package Lista_de_exercicio.Reuso_de_Classes.Q40;

public class LivroBiblioteca extends Livro{
    private boolean disponivelParaEmprestimo;

    public LivroBiblioteca(int idLivro, String nome, String autor, int quantidadeDePaginas, int anoDeLancamento,
            boolean disponivelParaEmprestimo) {
        super(idLivro, nome, autor, quantidadeDePaginas, anoDeLancamento);
        this.disponivelParaEmprestimo = disponivelParaEmprestimo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDisponivel para emprestimo: " + disponivelParaEmprestimo + "\n";
    }
}
