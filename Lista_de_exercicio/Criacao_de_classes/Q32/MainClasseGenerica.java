package Lista_de_exercicio.Criacao_de_classes.Q32;

public class MainClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica objeto1 = new ClasseGenerica();
        ClasseGenerica.n1 = 1;
        ClasseGenerica.n2 = 3;
        ClasseGenerica.n3 = 1;
        objeto1.ImprimeValores();
        System.out.println(objeto1.CalculaQuantosIguais());

        
        
    }
}
