package Lista_de_exercicio.Introducao_ao_java;

public class Q13 {
    public static void main(String[] args) {
        for(int i = 1; i <= 60; i++){
            System.out.print("[" + i + "]\t");
            if(i % 10 == 0){
                System.out.println("");
            }
        }
    }
}
