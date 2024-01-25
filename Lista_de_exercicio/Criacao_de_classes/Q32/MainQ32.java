package Lista_de_exercicio.Criacao_de_classes.Q32;

public class MainQ32 {
    public static void main(String[] args) {
        EhIgual<Integer> testaiguais = new EhIgual<>(2, 0, 1);
        System.out.println("quantidade de numeros iguais: " + testaiguais.CalculaQuantIguais());
        System.out.println(testaiguais.toString());
    }
}
