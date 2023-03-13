package modelo;

public class Moto extends Vehiculo {

    public int tarifa = 0;

    @Override
    public double calcularPagoPeaje() {
        return tarifa ;
    }

    public Moto() {

    }

    public Moto (String marca, String Placa) {
        super(marca, Placa); // Llama al constructor de la clase abstracta vehiculo
    }
    
}
