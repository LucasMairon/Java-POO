package exercicios_da_aula.aula_7.data;

public class MainData {
    public static void main(String[] args) {
        Data natal2023 = Data.dataNatal(2023);
        Data natal2022 = Data.dataNatal(2022);
        Data natal2021 = Data.dataNatal(2021);
        Data natal0 = Data.dataNatal(-10);

        System.out.println(natal2023);
        System.out.println(natal2022);
        System.out.println(natal2021);
        System.out.println(natal0);
    }
}
