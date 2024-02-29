package Lista_de_exercicio.Array_e_ArrayLists.Q33;

public class EntradaEmAgenda{
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;


    public EntradaEmAgenda(int hora,int dia,int mes,int ano,String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    
    public boolean EhNoDia(int dia, int mes, int ano){
        if(this.dia == dia && this.mes == mes && this.ano == ano){
            return true;
        }
        return false;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "hora: " + hora + "\n" + "dia: " + dia + "\n" + "mes: " + mes + '\n' + "Ano: " + ano + "\n" + "Assunto: " + assunto + "\n";
    }
}