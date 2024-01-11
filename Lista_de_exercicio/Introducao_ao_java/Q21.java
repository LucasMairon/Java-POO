package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q21{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o numero que deseja saber se é primo: ");
        int numero = scan.nextInt();
        System.out.println(verificaSeEPrimo(numero, 1,1));
        scan.close();
    }

    public static int verificaSeEPrimo(int n,int divisores,int contadcontadorDeDivisores){
        if(n == divisores){
            if(contadcontadorDeDivisores == 2){
                System.out.println("o número é primo");
                return 1;
            }else{
                System.out.println("o número não é primo");
                return 0;
            }
        }
        if(n % divisores == 0){
            return verificaSeEPrimo(n, ++divisores, ++contadcontadorDeDivisores);
        }else{
            return verificaSeEPrimo(n, ++divisores,contadcontadorDeDivisores);
        }
    }
}