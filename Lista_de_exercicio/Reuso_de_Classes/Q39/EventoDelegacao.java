package Lista_de_exercicio.Reuso_de_Classes.Q39;

public class EventoDelegacao {
    private DataHora dataeHora;
    private String evento;
    
    public EventoDelegacao() {
        dataeHora = new DataHora();
    }

    public DataHora getDataeHora() {
        return dataeHora;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return dataeHora.toString() + "Evento: " + evento + "\n";
    }
    
}
