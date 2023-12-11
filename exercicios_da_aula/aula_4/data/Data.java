package exerciciosAulas.data;

public class Data{
    int dia;
    int mes;
    int ano;

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
