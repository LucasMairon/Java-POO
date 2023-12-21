package aula_4.data;
import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o dia, mes e ano:");

        data.inicializaData(scan.nextInt(), scan.nextInt(), scan.nextInt());
        if(data.dataEValida()){
            System.out.println("data valida");
            data.MostraData();
        }else{
            System.out.println("data invalida");
        }
        
    }
}
