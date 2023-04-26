package demonio;
public class joinExample extends Thread {
    
     public void run () {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread " + Thread.currentThread() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     }

     public static void main(String[] args) {
        joinExample j1 = new joinExample();
        joinExample j2 = new joinExample();
        joinExample j3 = new joinExample();

        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        j1.start();
        j2.start();
        j3.start();
     }
}
