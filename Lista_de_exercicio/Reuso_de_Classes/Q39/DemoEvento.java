package Lista_de_exercicio.Reuso_de_Classes.Q39;

public class DemoEvento {
    public static void main(String[] args) {
        EventoDelegacao evDelegacao = new EventoDelegacao();
        EventoHeranca evHeranca = new EventoHeranca();

        evDelegacao.getDataeHora().setData("01/03/2004");
        evDelegacao.getDataeHora().setHorario("17:29");
        evDelegacao.setEvento("Festa");

        evHeranca.setData("01/03/2025");
        evHeranca.setHorario("17:30");
        evHeranca.setEvento("Aniversario");



        System.out.println(evDelegacao);
        System.out.println(evHeranca);
    }
}
