package aula_4.data;

public class Data{
    private int dia;
    private int mes;
    private int ano;

    public boolean dataEValida(){
        return(this.dia > 0 && this.dia <= 30 && this.mes > 0 && this.mes <= 12 && this.ano >=0);
    }

    public void inicializaData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void MostraData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

}
