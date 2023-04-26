public class Contador {
    public void contar() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Contador: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Contador interrumpido");
        }
    }
    
}
