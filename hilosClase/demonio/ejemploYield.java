package demonio;
public class ejemploYield extends Thread {
    public void run () {
        for (int i = 0; i < 4; i++) {
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
        ejemploYield  hilo1 = new ejemploYield();
        ejemploYield  hilo2 = new ejemploYield();

        hilo1.start();
        hilo2.start();

        for (int i=0; i<3; i++) {
            hilo1.yield(); // establece la prioridad del hilo actual a la prioridad del hilo mas alto en ejecucion
            System.out.println("El hilo 1 esta vivo? " + hilo1.isAlive());
            System.out.println("El hilo 2 esta vivo? " + hilo2.isAlive());
        }
    }
}
