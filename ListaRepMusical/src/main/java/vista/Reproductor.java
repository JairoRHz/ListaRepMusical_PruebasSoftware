
package vista;

import java.util.List;
import negocio.Sonido;
import negocio.controlCanciones;

/**
 *
 * @author Hermann Cazares
 */
public class Reproductor extends javax.swing.JFrame {

    public Reproductor() {
        initComponents();
        
        
        jbuttonDetener.setEnabled(false);
        jbuttonPausa.setEnabled(false);
        jbuttonReanudar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbuttonReproducir = new javax.swing.JButton();
        jcomboBoxlistaCancions = new javax.swing.JComboBox<>();
        jbuttonDetener = new javax.swing.JButton();
        jbuttonPausa = new javax.swing.JButton();
        jbuttonReanudar = new javax.swing.JButton();
        jlabelTexto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbuttonReproducir.setText("Reproducir");
        jbuttonReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonReproducirActionPerformed(evt);
            }
        });

        jcomboBoxlistaCancions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jcomboBoxlistaCancions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxlistaCancionsActionPerformed(evt);
            }
        });

        jbuttonDetener.setText("Detener");
        jbuttonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonDetenerActionPerformed(evt);
            }
        });

        jbuttonPausa.setText("Pausa");
        jbuttonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPausaActionPerformed(evt);
            }
        });

        jbuttonReanudar.setText("Reaundar");
        jbuttonReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonReanudarActionPerformed(evt);
            }
        });

        jlabelTexto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcomboBoxlistaCancions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbuttonReproducir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbuttonDetener)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbuttonPausa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbuttonReanudar)))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboBoxlistaCancions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonPausa)
                    .addComponent(jbuttonReanudar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonDetener)
                    .addComponent(jbuttonReproducir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jlabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonReproducirActionPerformed
        String CancionSeleccionada = (String) jcomboBoxlistaCancions.getSelectedItem();
        Sonido sonido = new Sonido();
        sonido.reproducirSonido("canciones/" + CancionSeleccionada + ".wav");
        jlabelTexto.setText("Reproduciendo cancion.");
        
        jbuttonDetener.setEnabled(true);
        jbuttonPausa.setEnabled(true);
    }//GEN-LAST:event_jbuttonReproducirActionPerformed

    private void jbuttonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonDetenerActionPerformed
        Sonido sonido = new Sonido();
        sonido.detenerSonido();
        jlabelTexto.setText("Cancion detenida.");
        
        jbuttonPausa.setEnabled(false);
        jbuttonReanudar.setEnabled(false);
    }//GEN-LAST:event_jbuttonDetenerActionPerformed

    private void jbuttonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPausaActionPerformed
        Sonido sonido = new Sonido();
        sonido.pausar();
        jlabelTexto.setText("Cancion pausada.");
        
        jbuttonPausa.setEnabled(false);
        jbuttonReanudar.setEnabled(true);
    }//GEN-LAST:event_jbuttonPausaActionPerformed

    private void jbuttonReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonReanudarActionPerformed
        Sonido sonido = new Sonido();
        sonido.reanudar();
        jlabelTexto.setText("Cancion reanudada.");
        
        jbuttonPausa.setEnabled(true);
        jbuttonReanudar.setEnabled(false);
    }//GEN-LAST:event_jbuttonReanudarActionPerformed

    private void jcomboBoxlistaCancionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxlistaCancionsActionPerformed
      
    }//GEN-LAST:event_jcomboBoxlistaCancionsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbuttonDetener;
    private javax.swing.JButton jbuttonPausa;
    private javax.swing.JButton jbuttonReanudar;
    private javax.swing.JButton jbuttonReproducir;
    private javax.swing.JComboBox<String> jcomboBoxlistaCancions;
    private javax.swing.JLabel jlabelTexto;
    // End of variables declaration//GEN-END:variables
}
