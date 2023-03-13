package modelo;

public class Camion extends Vehiculo {

    public int tarifa = 10000;
    
    @Override
    public double calcularPagoPeaje() {
        return tarifa;
    }

    public Camion() {

    }

    public Camion(String marca, String Placa) {
        super( marca, Placa); // Llama al constructor de la clase abstracta vehiculo
    }

}
