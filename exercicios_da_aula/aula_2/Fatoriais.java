package aulas.aula_2;

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        int n,fat;
        Scanner ent = new Scanner(System.in);
        System.out.print("insira um número: ");
        n = ent.nextInt();

        for(int i = 0; i <= n; i++){
           
            fat = 1;
            for(int j = i; j > 1; j--){
                fat *= j;
            }
            System.out.println("fatorial de " + i + " = " + fat);
        }

        ent.close();
    }
}
