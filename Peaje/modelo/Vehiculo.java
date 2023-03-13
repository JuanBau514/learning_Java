package modelo;

public abstract class Vehiculo {

    private String marca;
    private String Placa;

    public abstract double calcularPagoPeaje();

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String Placa) {
        this.marca = marca;
        this.Placa = Placa;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    @Override
    public String toString() {
        return "Vehiculo { marca=" + marca + ", Placa=" + Placa + '}';
    }
    
}
 