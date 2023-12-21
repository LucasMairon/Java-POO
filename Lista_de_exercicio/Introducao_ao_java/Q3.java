package Lista_de_exercicio.Introducao_ao_java;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Infome o  ângulo: ");
        double angulo = scan.nextDouble();
        System.out.println("Valor em graus radianos: " + Math.toRadians(angulo));
        System.out.println("Valor do seno do ângulo: " + Math.sin(angulo));
        System.out.println("Valor do cosseno do ângulo: " + Math.cos(angulo));
        System.out.println("Valor do tangente do ângulo: " + Math.tan(angulo));
        System.out.println("Valor do cossecante do ângulo: " + Math.asin(angulo));
        System.out.println("Valor do secante do ângulo: " + Math.acos(angulo));
        System.out.println("Valor do cotangente do ângulo: " + Math.atan(angulo));
        scan.close();
    }
}
