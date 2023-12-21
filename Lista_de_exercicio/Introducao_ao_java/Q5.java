package Lista_de_exercicio.Introducao_ao_java;
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o numero no formato CDU: ");
        int numeroNoFormatoCDU = scan.nextInt();
        int numeroNoFormatoUCD = 0;
        numeroNoFormatoUCD = inverterNumerosRecursivo(numeroNoFormatoCDU,numeroNoFormatoUCD);
        System.out.println("numero invertido: " + numeroNoFormatoUCD);
        scan.close();
                
    }

    
    public static int inverterNumerosRecursivo(int inverter, int invertido){
        if ((inverter % 10) == 0)
            return invertido;
        return  inverterNumerosRecursivo(inverter/10,invertido * 10 + (inverter % 10) );
    }

    
    
}