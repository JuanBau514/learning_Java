package modelo;

public class Cajero {

    public int dinero;

    public Cajero ( int dinero ) {
        this.dinero = dinero;
    }

    public Cajero () {
        this.dinero = 0;
    }

    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void depositar(Cuenta cuenta, double cantidad) {
        cuenta.setSaldo(cuenta.getSaldo()+cantidad);
    }

    public void retirar(Cuenta cuenta, double cantidad) {

        cuenta.setSaldo(cuenta.getSaldo()-cantidad);
    }

    public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()-cantidad);
        cuentaDestino.setSaldo(cuentaDestino.getSaldo()+cantidad);
    }

    public void consultar(Cuenta cuenta) {
        System.out.println("El saldo de la cuenta es: "+cuenta.getSaldo());
    }

}
