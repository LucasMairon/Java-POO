package Introducao_ao_java;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("digite o valor do lado do quadrado: ");
        Scanner input = new Scanner(System.in);
        float ladoQuadrado = input.nextFloat();
        System.out.println("área do quadrado: " + (Math.pow(ladoQuadrado, 2)));
        input.close();
    }
}
