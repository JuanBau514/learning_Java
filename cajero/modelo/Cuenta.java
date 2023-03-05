package modelo;
public class Cuenta {

    private int numeroCuentaid;
    private String nombreUsuario;
    private double saldo;
    private String banco;

    public Cuenta(int numeroCuentaid, String nombreUsuario, double saldo, String banco) {
        this.numeroCuentaid = numeroCuentaid;
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
        this.banco = banco;
    }

    public Cuenta() {
        this.numeroCuentaid = 0;
        this.nombreUsuario = "";
        this.saldo = 0;
        this.banco = "";
    }

    public int getNumeroCuentaid() {
        return numeroCuentaid;
    }

    public void setNumeroCuentaid(int numeroCuentaid) {
        this.numeroCuentaid = numeroCuentaid;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString () {
        return "Numero de cuenta: "+numeroCuentaid+"\nNombre: "+nombreUsuario+"\nSaldo: "+saldo+"\nBanco: "+banco;
    } 
}
