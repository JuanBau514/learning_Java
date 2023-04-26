public class mainContador {

    public static void main(String[] args) {
        
        Contador contar = new Contador();
        ContadorHiloos hilo1 = new ContadorHiloos("Hilo aguapanelero",contar);
        ContadorHiloos hilo2 = new ContadorHiloos("Hilo 2",contar);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
    }
}
