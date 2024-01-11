package Lista_de_exercicio.Introducao_ao_java;

public class Q16{
    public static void main(String[] args) {
        for(int i = 100;i <= 999;i++){
            verificaSomaCubica(i);
        }
    }

    public static void verificaSomaCubica(int numero){
        int unidade,dezena,centena,numeroAuxiliar,somaCubica;
        numeroAuxiliar = numero;
        unidade = (numeroAuxiliar % 10);
        numeroAuxiliar = (numeroAuxiliar / 10);
        dezena = (numeroAuxiliar % 10);
        numeroAuxiliar = (numeroAuxiliar / 10);
        centena = numeroAuxiliar;
        somaCubica =(int) (Math.pow(unidade, 3) + Math.pow(dezena, 3) + Math.pow(centena, 3));
        if(somaCubica == numero){
            System.out.println(numero + " tem soma cubica perfeita pois " + unidade + "^3 + " + dezena + "^3 + "+ centena + "^3 " + " = " + numero);
        }
    }
}