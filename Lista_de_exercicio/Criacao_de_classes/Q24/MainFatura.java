package Lista_de_exercicio.Criacao_de_classes.Q24;

public class MainFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(01, "Pão", -4, -3);
        fatura.ImprimeDadosFatura();
        Fatura faturaCerta = new Fatura(02,"Ovo",3,4);
        faturaCerta.ImprimeDadosFatura();
        System.out.println("fatura errada: " + fatura.calculaTotal());
        System.out.println("fatura certa: " + faturaCerta.calculaTotal());
    }
}
