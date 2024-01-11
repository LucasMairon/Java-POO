package Lista_de_exercicio.Criacao_de_classes.Q26;

public class Elevador {
    private int numeroDoAndarAtual;
    private int totalDeAndares;
    private int capacidade;
    private int pessoasUtilizando;

    public Elevador(int totalDeAndares, int capacidade) {
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.numeroDoAndarAtual = 0;
        this.pessoasUtilizando = 0;
    }

    public boolean entrarNoElevador(){
        if(pessoasUtilizando < capacidade){
            this.pessoasUtilizando++;
            System.out.println("1 pessoa entrou no elevador, capacidade restante: " + (capacidade - this.pessoasUtilizando));
            return true;
        }else{
            System.out.println("sem espaço no elevador, aguarde e tente novamente");
            return false;
        }
    }

    public boolean SaiDoElevador(){
        if(pessoasUtilizando > 0){
            this.pessoasUtilizando--;
            System.out.println("1 pessoa saiu do elevador, capacidade restante: " + (capacidade - this.pessoasUtilizando));
            return true;
        }else{
            System.out.println("não há pessoas para sair do elevador");
            return false;
        }
    }

    public boolean sobeAndar(){
        if(numeroDoAndarAtual < totalDeAndares){
            this.numeroDoAndarAtual++;
            System.out.println("o elevador subiu um andar, andar atual: " + this.numeroDoAndarAtual);
            return true;
        }else{
            System.out.println("ultimo andar alcaçado, não tem mais como subir");
            return false;
        }
    }

    public boolean desceAndar(){
        if(numeroDoAndarAtual > 0){
            this.numeroDoAndarAtual--;
            System.out.println("o elevador desceu um andar, andar atual: " + this.numeroDoAndarAtual);
            return true;
        }else{
            System.out.println("terreo alcançado, não tem como descer mais");
            return false;
        }
    }

    
}
