package aula_4.triangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String descricao;

    public void inicializaTriangulo(double lado1, double lado2, double lado3, String descricao){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.descricao = descricao;
    }

    public double perimetroTriangulo(){
        return this.lado1 + this.lado2 + this.lado3;
    }
}
