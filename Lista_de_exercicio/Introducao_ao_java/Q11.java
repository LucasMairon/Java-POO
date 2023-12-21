package Lista_de_exercicio.Introducao_ao_java;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite as coordenadas do primeiro ponto(ordem x,y):");
        double xPonto1 = scan.nextDouble();
        double yPonto1 = scan.nextDouble();
        System.out.println("digite as coordenadas do segundo ponto(ordem x,y):");
        double xPonto2 = scan.nextDouble();
        double yPonto2 = scan.nextDouble();
        if(xPonto1 > xPonto2){
            System.out.println("o primeiro ponto está a direita do segundo");
        }else{
            System.out.println("o primeiro ponto está a esquerda do segundo");
        }
        if(yPonto1 > yPonto2){
            System.out.println("o primeiro ponto está acima do segundo");
        }else{
            System.out.println("o primeiro ponto está abaixo do segundo");
        }
        scan.close();

    }
}
