package Lista_de_exercicio.Colecoes_genericas.Q50;
import java.util.Stack;

public class DemoPilha {
    public static void main(String[] args) {
        Stack<Character> parenteses = new Stack<>();

        parenteses.add('(');
        parenteses.add(')');
        parenteses.add('(');

        if(parenteses.size() % 2 == 0){
            System.out.println("Balanceada");
        }else{
            System.out.println("Desbalanceada");
        }
    }
}
