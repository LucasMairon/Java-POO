package Lista_de_exercicio.Array_e_ArrayLists.Q33;

public class DemoAgenda{
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();

        agenda1.CriaCompromisso(3, 01, 03, 2004, "Nasci");
        agenda1.CriaCompromisso(3, 10, 12, 2021, "Tarefa");
        agenda1.CriaCompromisso(10, 19, 06, 2019, "Atividades de casa");
        agenda1.CriaCompromisso(19, 6, 07, 2025, "compromisso");
        agenda1.CriaCompromisso(2, 01, 03, 2004, "Aniversario");

        agenda1.listaDia(01, 03, 2004);
    }
}