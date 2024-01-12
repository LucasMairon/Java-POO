package Lista_de_exercicio.Criacao_de_classes.Q29;

public class NumeroComplexo {
    private double parteReal;
    private int parteImaginaria;

    public NumeroComplexo(double parteReal,int parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    public NumeroComplexo(double parteReal){
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }
    public NumeroComplexo(){
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }
    @Override
    public String toString(){
        if(parteImaginaria == 0 && parteReal == 0){
            return "0";
        }else if(parteImaginaria == 0 && parteReal != 0){
            return "" + parteReal;
        }else{
            return(this.parteReal + " + " + this.parteImaginaria + "i");
        }
    }
}
