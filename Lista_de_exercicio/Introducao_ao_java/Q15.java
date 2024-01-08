package Lista_de_exercicio.Introducao_ao_java;

public class Q15{
    public static void main(String[] args){
        int quantidadeDeNumerosPerfeitos = 0,n = 1;
        while(quantidadeDeNumerosPerfeitos <= 4){
            if(verificaSeEPerfito(n)){
                System.out.println(n + " é perfeito");
                quantidadeDeNumerosPerfeitos++;
            }
            n++;
        }
    }

    public static boolean verificaSeEPerfito(int n){
        int i = 1,somaDivisores = 0;
        while(i != n){
            if(n % i == 0){
                somaDivisores += i;
            }
            i++;
        }
         if(somaDivisores == n){
            return true;
        }
        return false;
    }
}