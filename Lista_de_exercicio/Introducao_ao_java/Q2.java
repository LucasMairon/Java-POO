package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("digite 3 numeros");
        Scanner input = new Scanner(System.in);
        float primeiroNumero = input.nextFloat();
        float segundoNumero = input.nextFloat();
        float terceiroNumero = input.nextFloat();
        System.out.println("A soma dos três números é: " + (primeiroNumero + segundoNumero + terceiroNumero));
        System.out.println("A media dos 3 numeros é: " + ((primeiroNumero + segundoNumero + terceiroNumero)/3));
        input.close();
    }
}
