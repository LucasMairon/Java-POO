package exercicios_da_aula.aula_7.tupla;

public class MainTupla {
    public static void main(String[] args) {
        Double d = 2.5;
        String s = "UFERSA";
        Float f = 3.5F;

        Tupla<Double,String> t1 = new Tupla<>(d, s);
        System.out.println("v1: " + t1.getV1() + " classe: " + t1.getV1().getClass());
        System.out.println("v2: " + t1.getV2() + " classe: " + t1.getV2().getClass());
    }
}
