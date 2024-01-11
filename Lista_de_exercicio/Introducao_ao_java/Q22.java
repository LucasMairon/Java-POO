package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite um valor para n: ");
        int n = scan.nextInt();
        System.out.print("digite um valor para x: ");
        int x = scan.nextInt();
        System.out.print("digite um valor para a: ");
        int a = scan.nextInt();
        System.out.println(calculaPolinomio(x, n, a));

        scan.close();
    }

    public static int calculaPolinomio(int x, int n, int a){
        if(n == 0){
            return a;
        }

        return x * calculaPolinomio(x, n-1, a) + a;
    }
}
