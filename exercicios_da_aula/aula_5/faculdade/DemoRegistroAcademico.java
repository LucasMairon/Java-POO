package aula_5.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("michael", "cs0981", 3, 0.75);
        System.out.println("Mensalidade de Michael: " + michael.calculaMensalidade());
        System.out.println("Matricula de michael: " + michael.matricula);

        RegistroAcademico roberto = new RegistroAcademico();
        System.out.println(roberto.calculaMensalidade());
        
    }
}
