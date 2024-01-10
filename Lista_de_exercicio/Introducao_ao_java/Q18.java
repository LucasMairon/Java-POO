package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a base");
        int base = scan.nextInt();
        System.out.println("digite o expoente");
        int expoente = scan.nextInt();
        System.out.println("resultado da potencia: " + potencia(base, expoente));
    }

    public static int potencia(int base,int expoente){
        if(expoente == 0){
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
}
