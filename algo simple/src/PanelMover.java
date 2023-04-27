import javax.swing.*;

public class PanelMover extends Thread {
    private JPanel panel;
    private int velocidad;
    private int posicion;
    private boolean detener;

    public PanelMover(JPanel panel) {
        this.panel = panel;
        this.velocidad = this.velocidad;
        this.posicion = 0;
        this.detener = false;
    }

    @Override
    public void run () {
        while (!this.detener) {
            int x = this.panel.getX();
            int y = this.panel.getY();

            // actualizamos la posicion en funcion de la velocidad y direccion
            x += this.velocidad ;
            y += this.velocidad ;

            this.panel.setLocation(x, y);
            this.panel.repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void detener() {
        this.detener = true;
    }
    
}
