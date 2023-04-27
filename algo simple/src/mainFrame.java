/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juanpbcl514
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        this.initComponents();
    }

    PanelMover hilo1 = new PanelMover(this.panelHilo1);
    PanelMover hilo2 = new PanelMover(this.panelHilo2);
    PanelMover hilo3 = new PanelMover(this.panelHilo3);

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jButton2 = new javax.swing.JButton();
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jLabel3 = new javax.swing.JLabel();
        this.panelHilo1 = new javax.swing.JPanel();
        this.panelHilo2 = new javax.swing.JPanel();
        this.panelHilo3 = new javax.swing.JPanel();
        this.boton1 = new javax.swing.JButton();
        this.boton2 = new javax.swing.JButton();
        this.boton3 = new javax.swing.JButton();

        this.jButton2.setText("jButton1");

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jLabel1.setText("Hilo 1");

        this.jLabel2.setText("Hilo 2");

        this.jLabel3.setText("Hilo 3");

        this.panelHilo1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelHilo1Layout = new javax.swing.GroupLayout(this.panelHilo1);
        this.panelHilo1.setLayout(panelHilo1Layout);
        panelHilo1Layout.setHorizontalGroup(
            panelHilo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        panelHilo1Layout.setVerticalGroup(
            panelHilo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        this.panelHilo2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelHilo2Layout = new javax.swing.GroupLayout(this.panelHilo2);
        this.panelHilo2.setLayout(panelHilo2Layout);
        panelHilo2Layout.setHorizontalGroup(
            panelHilo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        panelHilo2Layout.setVerticalGroup(
            panelHilo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        this.panelHilo3.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout panelHilo3Layout = new javax.swing.GroupLayout(this.panelHilo3);
        this.panelHilo3.setLayout(panelHilo3Layout);
        panelHilo3Layout.setHorizontalGroup(
            panelHilo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        panelHilo3Layout.setVerticalGroup(
            panelHilo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        this.boton1.setText("mover hilo 3");
        this.boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrame.this.boton1ActionPerformed(evt);
            }
        });

        this.boton2.setText("mover hilo 2");
        this.boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrame.this.boton2ActionPerformed(evt);
            }
        });

        this.boton3.setText("mover hilo 1");
        this.boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrame.this.boton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(this.jLabel3)
                    .addComponent(this.jLabel2)
                    .addComponent(this.jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(this.panelHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.panelHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.panelHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(this.boton3)
                .addGap(49, 49, 49)
                .addComponent(this.boton2)
                .addGap(40, 40, 40)
                .addComponent(this.boton1)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(this.jLabel1)
                            .addComponent(this.panelHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(this.jLabel2))
                    .addComponent(this.panelHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(this.jLabel3)
                    .addComponent(this.panelHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.boton1)
                    .addComponent(this.boton2)
                    .addComponent(this.boton3))
                .addGap(58, 58, 58))
        );

        this.pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Funcionalidad de movimiento y detención del hilo 1
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {   
             
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelHilo1;
    private javax.swing.JPanel panelHilo2;
    private javax.swing.JPanel panelHilo3;
    // End of variables declaration//GEN-END:variables
}
