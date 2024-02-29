package Lista_de_exercicio.Reuso_de_Classes.Q38;

public class Computador extends Equipamento {
    private String modelo;
    private String marca;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + "Modelo: " + modelo + "\n" + "Marca: " + marca + "\n";
    }

}
