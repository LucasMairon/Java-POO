package aulas.aula_6.caixas;

public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos = 0;
    
    CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
        System.out.println("Caixa " + numeroCaixa + " inicializado");
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa " + numeroCaixa + " atendeu o cliente " + ++clientesAtendidos);
    }
}
