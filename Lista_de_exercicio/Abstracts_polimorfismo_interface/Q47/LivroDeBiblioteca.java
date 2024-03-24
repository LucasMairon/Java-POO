package Lista_de_exercicio.Abstracts_polimorfismo_interface.Q47;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private int numeroCorredor;
    private String letraPrateleira;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, boolean emprestado,
            int numeroCorredor, String letraPrateleira, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = emprestado;
        this.numeroCorredor = numeroCorredor;
        this.letraPrateleira = letraPrateleira;
        this.descricao = descricao;
    }

    @Override
    public void devolve() {
        emprestado = false;
        
    }

    @Override
    public void empresta() {
        emprestado = true;
        
    }

    @Override
    public boolean estaEmprestado() {
        if(emprestado){
            return true;
        }
        return false;
    }

    @Override
    public String localizacao() {
        return "Corredor " + numeroCorredor + ", prateleira " + letraPrateleira + "\n";
    }

    public String descricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nNumero de paginas: " + getNumeroDePaginas() + "\nAno da edicao: " + getAnoDaEdicao() + "\nEmprestado: " + emprestado + "\nLocalização: " + localizacao() + "Descricao: " + descricao();
    }
    
}
