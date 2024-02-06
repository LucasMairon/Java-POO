package exercicios_da_aula.aula_8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xy[][] = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                xy[i][j] = 1;
            }
        }
        System.out.println("Antes de formatar:");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(xy[i][j]+" ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
        
        System.out.println("Depois de formatar:");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j>=i){
                    System.out.print(xy[i][j]+" ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.printf("\n");
        }
        input.close();
    }
}
