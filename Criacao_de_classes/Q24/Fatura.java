package Criacao_de_classes.Q24;

public class Fatura {
    
    int id;
    String descricao;
    int quantidadeComprada;
    double precoUnitario;


    public Fatura(int id, String descricao, int quantidadeComprada, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;

        if(quantidadeComprada > 0){
            this.quantidadeComprada = quantidadeComprada;
        }
        if(precoUnitario > 0){
            this.precoUnitario = precoUnitario;
        }
    }


    public double calculaTotal(){
        return this.quantidadeComprada * this.precoUnitario;
    }

    public void ImprimeDadosFatura(){
        System.out.println("ID do item: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade comprada: " + this.quantidadeComprada);
        System.out.println("Preço por unidade: " + this.precoUnitario);
    }
}
