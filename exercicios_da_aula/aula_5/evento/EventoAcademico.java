package aula_5.evento;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento,String localDoEvento,int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento(){
        System.out.println("Nome do evento: " + this.nomeDoEvento);
        System.out.println("Local do evento: " + this.localDoEvento);
        System.out.println("Numero de participantes: " + this.numeroDeParticipantes);
    }

    
}
