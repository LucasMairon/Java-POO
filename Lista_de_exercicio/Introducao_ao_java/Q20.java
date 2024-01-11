package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("esse programa realiza o mdc entre 2 números");
        System.out.print("digite o primeiro numero: ");
        int primeiroNumero = scan.nextInt();
        System.out.print("digite o segundo numero: ");
        int segundoNumero = scan.nextInt();
        System.out.println(mdc(primeiroNumero, segundoNumero));
        scan.close();
    }

    public static int mdc(int m, int n){
        if(n > m){
            return mdc(n, m);
        }else if(n == 0){
            return m;
        }
        return mdc(n, m % n);
    }
}
