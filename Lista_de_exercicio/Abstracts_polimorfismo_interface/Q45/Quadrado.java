package Lista_de_exercicio.Abstracts_polimorfismo_interface.Q45;

public class Quadrado extends FiguraGeometrica {
    @Override
    void desenha() {
        System.out.print("\t_________");
        System.out.print("\n\t|\t|");
        System.out.print("\n\t|\t|");
        System.out.print("\n\t_________");
    }
}
