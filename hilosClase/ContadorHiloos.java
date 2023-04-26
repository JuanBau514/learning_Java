
public class ContadorHiloos extends Thread{
    private Thread hilo;
    private String nombreHilo;
    Contador contador;

    ContadorHiloos(String name, Contador pd) {
        this.nombreHilo = name;
        this.contador =pd;
    }

    public void run() {
        synchronized(this.contador) {
            this.contador.contar();
        }
        System.out.println("Saliendo del  " + this.nombreHilo + " hilo");
    }

    public void start() {
        System.out.println("Iniciando " + this.nombreHilo);
        if (this.hilo == null) {
            this.hilo = new Thread(this, this.nombreHilo);
            this.hilo.start();
        }
    }

}
