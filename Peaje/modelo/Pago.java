package modelo;

import java.time.LocalDate;

public class Pago {

    private Peaje peaje;
    private Vehiculo vehiculo;
    private double pago;
    private LocalDate fecha;

    public Pago(Peaje peaje, Vehiculo vehiculo, double pago, LocalDate fecha) {
        this.peaje = peaje;
        this.vehiculo = vehiculo;
        this.pago = pago;
        this.fecha = fecha;
    }

    public Pago() {
    }

    public Peaje getPeaje() {
        return peaje;
    }

    public void setPeaje(Peaje peaje) {
        this.peaje = peaje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago{" + "peaje=" + peaje + ", vehiculo=" + vehiculo + ", pago=" + pago + ", fecha=" + fecha + '}';
    }
    
}