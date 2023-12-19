package Lista_de_exercicio.Criacao_de_classes.Q23;

public class Time {
    String nomeDoTime;
    int quantidadeDeJogadores;
    int numeroDeMedalhas;

    public Time(String nomeDoTime, int quantidadeDeJogadores, int numeroDeMedalhas) {
        this.nomeDoTime = nomeDoTime;
        this.quantidadeDeJogadores = quantidadeDeJogadores;
        this.numeroDeMedalhas = numeroDeMedalhas;
    }

    public void imprimeInformacoesDoTime(){
        System.out.println("Nome do time: " + this.nomeDoTime);
        System.out.println("Quantidade de jogadores no time: " + this.quantidadeDeJogadores);
        System.out.println("Numero de mdealhas: " + this.numeroDeMedalhas);
    }

    
}
