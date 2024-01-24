package aulas.aula_6.circulo;

public class Circulo {
    private double raio;
    public final static double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2 * PI * raio;
    }
}
