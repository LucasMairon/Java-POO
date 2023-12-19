package Lista_de_exercicio.Introducao_ao_javaIntroducao_ao_java;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("digite 3 numeros:");
        int primeiroNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        int terceiroNumero = scan.nextInt();
        int menorNumero = Math.min(primeiroNumero, segundoNumero);
        menorNumero = Math.min(terceiroNumero, menorNumero);
        System.out.println("o menor numero é: " + menorNumero);

        scan.close();
    }
}
