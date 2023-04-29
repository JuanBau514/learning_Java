/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movimientohilos;

import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author juanpbaucl
 */
public class mainJFrame extends javax.swing.JFrame {

    
    public mainJFrame() {
        super("Movimiento de figuras");
        this.initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanel1 = new javax.swing.JPanel();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setBackground(new java.awt.Color(204, 255, 204));

        this.jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

     public void paint(java.awt.Graphics g) { // esta funcion dibuja y mueve las figuras
        super.paint(g);
        int direccion = 1; // 1 = derecha, 0 = izquierda
        int k = 0; // contador para el movimiento de las figuras
        boolean flag = true; // bandera para saber si se debe mover a la derecha o izquierda

        for (int i=0; flag ; i++) {
            //creando las 2 figuras circulo y cuadrado
            g.fillOval(k, 50, 50, 50); // circulo
            g.fillRect(k, 200, 50, 50); // cuadrado

            if (direccion == 1) { // si la direccion es 1, se mueve a la derecha
                k++;
            } else { // si la direccion es 0, se mueve a la izquierda
                k--;
            }

            if (k == 650) { // si llega al limite de la derecha, cambia la direccion a izquierda
                direccion = 0;
            } else if (k == 0) { // si llega al limite de la izquierda, cambia la direccion a derecha
                direccion = 1;
            }

            try {
                Thread.sleep(10); // tiempo de espera para que se vea el movimiento
            } catch (InterruptedException ex) {
                Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            g.clearRect(i, 50, 50, 50); // borra el circulo
            g.clearRect(i, 200, 50, 50); // borra el cuadrado
        }

    }
    

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
