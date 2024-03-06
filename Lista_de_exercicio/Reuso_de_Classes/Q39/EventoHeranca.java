package Lista_de_exercicio.Reuso_de_Classes.Q39;

public class EventoHeranca extends DataHora {
    private String evento;

    @Override
    public String toString() {
        return super.toString() + "Evento: " + evento + "\n";
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
