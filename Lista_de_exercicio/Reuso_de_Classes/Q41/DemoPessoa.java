package Lista_de_exercicio.Reuso_de_Classes.Q41;

public class DemoPessoa {
    public static void main(String[] args) {
        Governador governador = new Governador("eunicio", "9182910", "Partido 1", "RN");
        Prefeito prefeito = new Prefeito("joão", "1839229", "Partido 3", "Pau dos Ferros");
        Politico politico = new Politico("luiza", "1829103", "Partido 2");
        Pessoa pessoa = new Pessoa("maria", "10833928");
        
        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }



}
