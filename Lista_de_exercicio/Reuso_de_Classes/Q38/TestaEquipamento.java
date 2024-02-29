package Lista_de_exercicio.Reuso_de_Classes.Q38;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento();
        Computador c = new Computador();

        e.setTipo("Eletronico");
        e.setNome("Computador");
        c.setNome("Computador 2");
        c.setTipo("Eletronico");
        c.setMarca("Positivo");
        c.setModelo("MG6xo");

        System.out.println(e);
        System.out.println(c);
    }
}
