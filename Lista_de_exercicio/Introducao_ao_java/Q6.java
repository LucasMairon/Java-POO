package Lista_de_exercicio.Introducao_ao_javaIntroducao_ao_java;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o intervalo em minutos: ");
        int tempoEmMinutosGeral = scan.nextInt();
        System.out.print(tempoEmMinutosGeral + " = ");
        int tempoEmDias,tempoEmHoras,tempoEmMinutos;
        tempoEmDias = (tempoEmMinutosGeral/(24*60));
        tempoEmMinutosGeral = (tempoEmMinutosGeral%(24*60));
        tempoEmHoras = (tempoEmMinutosGeral / 60);
        tempoEmMinutosGeral = (tempoEmMinutosGeral % 60);
        tempoEmMinutos = tempoEmMinutosGeral;
        System.out.println(tempoEmDias + " dias " + tempoEmHoras + " horas " + tempoEmMinutos + " minutos");


        scan.close();
    }
}
