package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        System.out.print("digite o número: ");
        Scanner scan = new Scanner(System.in);
        int limiteSequenciaFibonacci = scan.nextInt();
        fibonacci(limiteSequenciaFibonacci);
        scan.close();
    }

    public static void fibonacci(int limiteSequenciaFibonacci){
        int n1 = 1,n2 = 1, n3 = 0;
        for(int i = 0; i < limiteSequenciaFibonacci;i++){
            n3 = n2 + n1;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            
        }
    }
}
