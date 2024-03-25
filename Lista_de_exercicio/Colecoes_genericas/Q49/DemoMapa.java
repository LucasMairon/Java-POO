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

        for(int i = 0; i < texto.length(); i++){
            letra = texto.charAt(i);
            if(letra != ' '){
                if(caracteres.containsKey(letra)){
                    caracteres.put(letra,caracteres.get(letra) + 1);
                }else{
                    caracteres.put(letra, 1);
                }
            }
        }

        System.out.println(caracteres);

        scan.close();
    }
    
}
