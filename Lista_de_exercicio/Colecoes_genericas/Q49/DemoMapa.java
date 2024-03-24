package Lista_de_exercicio.Colecoes_genericas.Q49;
import java.util.TreeMap;
import java.util.Scanner;

public class DemoMapa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeMap<Character,Integer>caracteres = new TreeMap<>();
        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();
        Character letra;
        int valor = 1;
        for(int i = 0; i < texto.length(); i++){
            letra = texto.charAt(i);
            if(caracteres.containsKey(letra)){
                caracteres.put(letra,valor++);
            }else{
                caracteres.put(letra, valor);
            }
        }

        for(int i = 0; i < caracteres.size();i++){
            letra = texto.charAt(i);
            System.out.println(caracteres.get(letra) + ": " + caracteres.get(letra).valueOf(i));
        }

        scan.close();
    }
}
