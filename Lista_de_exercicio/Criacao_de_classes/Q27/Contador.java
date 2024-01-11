package Lista_de_exercicio.Criacao_de_classes.Q27;

public class Contador {
    private int contador;

    public Contador(){
        this.contador = 0;
    }


    public void zeraContador(){
        this.contador = 0;
    }
    public void incrementaContador(){
        this.contador++;
    }
    public void imprimeContador(){
        System.out.println(this.contador);
    }
}
