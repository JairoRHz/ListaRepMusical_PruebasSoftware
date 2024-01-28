
package vista;

/**
 *
 * @author Hermann Cazares
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbuttonReproductor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbuttonReproductor.setText("Reproductor");
        jbuttonReproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonReproductorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jbuttonReproductor)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jbuttonReproductor)
                .addGap(149, 149, 149))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonReproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonReproductorActionPerformed
       Reproductor pantalla = new Reproductor();
       pantalla.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbuttonReproductorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuttonReproductor;
    // End of variables declaration//GEN-END:variables
}
