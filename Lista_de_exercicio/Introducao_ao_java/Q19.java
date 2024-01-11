package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o numero");
        int numero = scan.nextInt();
        System.out.println(fatorial(numero));
        scan.close();
    }

    public static int fatorial(int n){
        int fat;
        if(n == 0){
            System.out.println("0! = 1");
            return 1;
        }
        fat = n * fatorial(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("\t");
        }
        System.out.println(n + "! = " + fat);
        return fat;
        
    }
}
