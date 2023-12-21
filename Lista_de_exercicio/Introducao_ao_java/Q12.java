package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        System.out.print("digite o dia do mes de fevereiro de 2015: ");
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        String nomeDoDia = "";
        if(dia == 1 || dia == 8 || dia == 15 || dia == 22){
            nomeDoDia = "domingo";
        }else if(dia == 2 || dia == 9 || dia == 16 || dia == 23){
            nomeDoDia = "segunda-feira";
        }else if(dia == 3 || dia == 10 || dia == 17 || dia == 24){
            nomeDoDia = "terça-feira";
        }else if(dia == 4 || dia == 11 || dia == 18 || dia == 25){
            nomeDoDia = "quarta-feira";
        }else if(dia == 5 || dia == 12 || dia == 19 || dia == 26){
            nomeDoDia = "quinta-feira";
        }else if(dia == 6 || dia == 13 || dia == 20 || dia == 27){
            nomeDoDia = "sexta-feira";
        }else if(dia == 7 || dia == 14 || dia == 21 || dia == 28){
            nomeDoDia = "sabado";
        }else{
            System.out.println("Número do dia inválido");
            return;
        }

        System.out.println("Dia " + dia + " é uma " + nomeDoDia);
        
    }
}
