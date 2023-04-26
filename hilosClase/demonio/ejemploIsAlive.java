package demonio;
public class ejemploIsAlive extends Thread {
    
    public void run () {
        for (int i = 0; i < 4; i++) {
            System.out.println("EL hilo " + Thread.currentThread() + " esta corriendo");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("El hilo " + Thread.currentThread() + " ha sido interrumpido");
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        ejemploIsAlive  hilo1 = new ejemploIsAlive();
        ejemploIsAlive  hilo2 = new ejemploIsAlive();

        hilo1.start();
        System.out.println("El hilo 1 esta vivo? " + hilo1.isAlive());
        System.out.println("El hilo 2 esta vivo? " + hilo2.isAlive());
        hilo2.start();
    }

}
