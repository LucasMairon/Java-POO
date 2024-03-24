package Lista_de_exercicio.Array_e_ArrayLists.Q37;

import java.util.Random;

public class LancamentoMoeda {


    public int sorteiaDado(int a,int b){
        Random dado = new Random();
        return dado.nextInt(a,b);
    }

    public int somaDados(){
        int dado1 = sorteiaDado(1, 7);
        int dado2 = sorteiaDado(1,7);
        return dado1+dado2;
    }

    public void ContaSomas(int n){
        int[] numeros = new int[13];
        for (int j = 0; j < n; j++) {
            for (int i = 2; i < numeros.length; i++) {
                if(somaDados() == i){
                    numeros[i]++;
                }
            }
            
        }
        for (int i = 2; i < numeros.length; i++){
            System.out.print(i + ": ");
            System.out.printf("%d\n",numeros[i]);
        }
    }
}
