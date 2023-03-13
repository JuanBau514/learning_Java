package modelo;

public class Carro extends Vehiculo{

    public int tarifa = 5500;

    @Override
    public double calcularPagoPeaje() {
        return tarifa;
    }

    public Carro() {
    }

    public Carro(String marca, String Placa) {
        super(marca, Placa); // Llama al constructor de la clase abstracta vehiculo
    }

    
}
