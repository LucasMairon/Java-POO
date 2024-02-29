package Lista_de_exercicio.Array_e_ArrayLists.Q36;

import java.util.ArrayList;

public class Produtorio {

    static int produto(int... numeros){
        int produtorio = 1;
        for (int i = 0; i < numeros.length; i++) {
            produtorio = produtorio * numeros[i];
        }
        return produtorio;
    }
}
