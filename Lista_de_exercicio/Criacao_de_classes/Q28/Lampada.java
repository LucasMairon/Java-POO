package Lista_de_exercicio.Criacao_de_classes.Q28;

import Lista_de_exercicio.Criacao_de_classes.Q27.Contador;

public class Lampada {
    private String estadoDaLampada = "apagada";
    private Contador quantidadeDeVezesAcesa;

    public Lampada(){
        this.quantidadeDeVezesAcesa = new Contador();
    }
    public void acende(){
        this.estadoDaLampada = "acesa";
        quantidadeDeVezesAcesa.incrementaContador();
    }

    public void apaga(){
        this.estadoDaLampada = "apagada";
    }

    public void mostraEstado(){
        System.out.println("estado da lampada: " + this.estadoDaLampada);
        System.out.print("a lampada foi ligada nessa quantidade de vezes: ");
        this.quantidadeDeVezesAcesa.imprimeContador();
        
    }

    public boolean estaLigada(){
        if(this.estadoDaLampada == "acesa"){
            return true;
        }else{
            return false;
        }
    }
}
