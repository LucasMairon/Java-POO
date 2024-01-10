package Lista_de_exercicio.Introducao_ao_java;

public class Q17 {
    public static void main(String[] args) {
        double populacaoCidadeA = 7000,populacaoCidadeB = 20000;
        int anos = 0;
        while(populacaoCidadeA <= populacaoCidadeB){
            populacaoCidadeA = populacaoCidadeA + (populacaoCidadeA * (3.5 / 100));
            populacaoCidadeB = populacaoCidadeB + (populacaoCidadeB * (1 / 100));
            anos++;
        }
        System.out.println("são necessários " + anos + " anos para a população da cidade A ser maior ou igual a da cidade B");

    }
}
