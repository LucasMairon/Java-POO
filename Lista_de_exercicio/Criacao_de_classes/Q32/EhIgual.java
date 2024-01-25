package Lista_de_exercicio.Criacao_de_classes.Q32;

public class EhIgual <T> {
    private T n1;
    private T n2;
    private T n3;

    public EhIgual(T n1, T n2, T n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int CalculaQuantIguais(){
        if(n1.equals(n2) || n1.equals(n3)){
            if(n2.equals(n3)){
                return 3;
            }else{
                return 2;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Primeiro atributo: " + n1 + "\nSegundo atributo: " + n2 + "\nTerceiro atributo: " + n3;
    }
}
