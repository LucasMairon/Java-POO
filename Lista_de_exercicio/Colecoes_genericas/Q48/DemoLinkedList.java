package Lista_de_exercicio.Colecoes_genericas.Q48;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<Character> lista1 = new LinkedList<>();
        lista1.add('A');
        lista1.add('B');
        lista1.add('C');
        lista1.add('D');
        lista1.add('E');
        lista1.add('F');
        lista1.add('G');
        lista1.add('H');
        lista1.add('I');
        lista1.add('J');
        LinkedList<Character> listaInversa = new LinkedList<>();

        for(int i = (lista1.size() - 1);i >= 0; i--){
            listaInversa.add(lista1.get(i));
        }

        System.out.println(listaInversa);
        
    }
}
