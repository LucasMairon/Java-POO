package Lista_de_exercicio.Reuso_de_Classes.Q39;

public class DataHora{
    private String data;
    private String horario;
    
    public void setData(String data) {
        this.data = data;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Data: " + data + "\nHorario: " + horario + "\n";
    }
}