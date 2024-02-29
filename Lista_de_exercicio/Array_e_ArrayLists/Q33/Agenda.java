package Lista_de_exercicio.Array_e_ArrayLists.Q33;

import java.util.ArrayList;
public class Agenda{
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda(){
        compromissos = new ArrayList<EntradaEmAgenda>();
    }

    public void CriaCompromisso(int hora, int dia, int mes, int ano, String assunto){
        compromissos.add(new EntradaEmAgenda(hora,dia,mes,ano,assunto));
    }

    public void listaDia(int dia, int mes, int ano){
        System.out.println("Instancias que caem no mesmo dia mes e ano passados: ");
        for (int i = 0; i < compromissos.size(); i++) {
            if(compromissos.get(i).getDia() == dia && compromissos.get(i).getMes() == mes && compromissos.get(i).getAno() == ano){
                System.out.println(compromissos.get(i));
            }
        }
    }

}