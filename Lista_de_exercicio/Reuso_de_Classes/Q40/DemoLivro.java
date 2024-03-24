package Lista_de_exercicio.Reuso_de_Classes.Q40;

public class DemoLivro {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro(01, "Harry potter e a pedra filosofal", "J.K. rowling", 200, 2005);
        LivroBiblioteca livro2 = new LivroBiblioteca(02, "Torto arado", "Itamar vieira", 267, 2003, true);
        LivroLivraria livro3 = new LivroLivraria(03, "Dom casmurro", "não sei", 140, 1998, 32.90);
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        
    }
}
