package Lista_de_exercicio.Criacao_de_classes.Q29;

public class MainNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo complexo = new NumeroComplexo(2, 4);
        NumeroComplexo complexoSemParteImaginaria = new NumeroComplexo(2);
        NumeroComplexo complexoVazio = new NumeroComplexo();

        System.out.println(complexo);
        System.out.println(complexoSemParteImaginaria);
        System.out.println(complexoVazio);
    }
}
