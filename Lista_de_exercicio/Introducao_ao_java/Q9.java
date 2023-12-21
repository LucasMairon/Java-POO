package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("digite o numero que representa o valor da carta: ");
        int valorDaCarta = scan.nextInt();

        System.out.print("digite um numero que corresponda ao naipe: ");
        int valorDoNaipe = scan.nextInt();

        String naipe = null;
        String valorCarta = null;

        switch(valorDoNaipe){
            case 1:
                naipe = " de ouros";
            break;
            case 2:
                naipe = " de paus";
            break;
            case 3:
                naipe = " de copas";
            break;
            case 4:
                naipe = " de espadas";
            break;
            default:
            
            break;
        }
        switch (valorDaCarta) {
            case 1:
                valorCarta = "Às";    
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            break;
            case 11:
                valorCarta = "Valete";
            break;
            case 12:
                valorCarta = "Rainha";
            break;
            case 13:
                valorCarta = "Rei";
            break;
            default:

            break;
        }

        if(valorCarta != null){
            System.out.println(valorCarta + naipe);
        }else{
            System.out.println(valorDaCarta + naipe);
        }
        scan.close();
    }
}
