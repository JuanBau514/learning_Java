package demonio;
public class ejemploDemonio extends Thread {
    
    public void run () {
        do {
            System.out.println("Soy un demonio");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Soy un demonio y me interrumpieron");
                return;
            }

        } while (this.isDaemon()); // si el hilo es demonio, se ejecuta
    }

    public static void main(String[] args) {
        ejemploDemonio  hilo1 = new ejemploDemonio();
        ejemploDemonio  hilo2 = new ejemploDemonio();
        ejemploDemonio hilo3 = new ejemploDemonio();

        hilo1.setDaemon(true); // establece el hilo como demonio
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
}
