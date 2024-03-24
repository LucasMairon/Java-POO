package Lista_de_exercicio.Abstracts_polimorfismo_interface.Q47;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nNumero de paginas: " + numeroDePaginas + "Ano da edicao: " + anoDaEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getAnoDaEdicao() {
        return anoDaEdicao;
    }
}
