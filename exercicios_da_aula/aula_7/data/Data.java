package exercicios_da_aula.aula_7.data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static Data dataNatal(int ano){
        if(ano < 0)
            return null;
            
        return new Data(25, 12, ano);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano; 
    }

}
