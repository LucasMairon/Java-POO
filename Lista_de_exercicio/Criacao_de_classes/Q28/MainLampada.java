package Lista_de_exercicio.Criacao_de_classes.Q28;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        System.out.println("a lampada esta ligada?" + lampada.estaLigada());
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
    }
}
