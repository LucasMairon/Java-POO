package Lista_de_exercicio.Array_e_ArrayLists.Q34;

public class Matriz {
    private float[][] matriz;

    public Matriz(float a, float b, float c, float d){
        matriz = new float[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    public float calculaDeterminante(){
        float determinante = matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]);
        return determinante;
    }

    @Override
    public String toString() {
        return "[" + matriz[0][0] + "\t" + matriz[0][1] + "]" + "\n" + "[" + matriz[1][0] + "\t" + matriz[1][1] + "]";
    }
}
