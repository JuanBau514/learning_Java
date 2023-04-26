package demonio;
public class ejemploSuspender extends Thread {
    
    public void run () {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " esta corriendo");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ejemploSuspender  hilo1 = new ejemploSuspender();
        ejemploSuspender  hilo2 = new ejemploSuspender();
        ejemploSuspender hilo3 = new ejemploSuspender();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo1.suspend(); // suspende el hilo
        hilo1.resume(); // reanuda el hilo

    }
}
