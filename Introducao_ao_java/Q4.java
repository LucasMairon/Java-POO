package introducao_ao_java;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){
        System.out.print("Digite os graus celsius para a converão: ");
        Scanner ent = new Scanner(System.in);
        double grausCelsius = ent.nextDouble();
        System.out.println( grausCelsius + " graus celsius convertendo para graus fahrenheit fica " + ((grausCelsius * 9/5)+32));
        ent.close();
    }
}
