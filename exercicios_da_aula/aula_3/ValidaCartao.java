package aula_2;

import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartao {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String nome, numeroDoCartao, codigoDoCartao;
        int mes,ano,mesAtual,anoAtual;
        boolean cartaoInvalido;
        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = 1 + calendar.get(Calendar.MONTH);
        Scanner ent = new Scanner(System.in);

        System.out.print("digite o nome: ");
        nome = ent.nextLine();
        System.out.print("digite o numero: ");
        numeroDoCartao = ent.nextLine();
        System.out.print("digite o codigo: ");
        codigoDoCartao = ent.nextLine();

        do{
            
            System.out.print("digite o mes: ");
            mes = ent.nextInt();
            System.out.print("digite o ano: ");
            ano = ent.nextInt();
            cartaoInvalido = (ano < anoAtual || (ano == anoAtual && mes < mesAtual));

            if(cartaoInvalido)
                System.out.println("cartao invalido");

        }while(cartaoInvalido);

        System.out.println("cartão valído, prossiga na conta");
        
        ent.close();
        
    }
}
