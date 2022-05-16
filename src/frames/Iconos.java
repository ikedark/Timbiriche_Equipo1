/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import Dominio.Jugador;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Iconos extends javax.swing.JDialog {
    //Se declara un jugador
    Jugador jugador;
    /**
     * Creates new form NewJDialog
     * @param parent
     * @param modal
     * @param jugador
     */
    public Iconos(java.awt.Frame parent, boolean modal,Jugador jugador) {
        super(parent, modal);
        initComponents();
        //Se centra la pantalla
        this.setLocationRelativeTo(null);
        //Se asigna el jugador del contructor al jugador de la clase
        this.jugador = jugador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIcono1 = new javax.swing.JLabel();
        labelIcono2 = new javax.swing.JLabel();
        labelIcono3 = new javax.swing.JLabel();
        labelIcono4 = new javax.swing.JLabel();
        botonSeleccionar1 = new javax.swing.JButton();
        botonSeleccionar2 = new javax.swing.JButton();
        botonSeleccionar3 = new javax.swing.JButton();
        botonSeleccionar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        labelIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar2R.png"))); // NOI18N

        labelIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar3R.png"))); // NOI18N

        labelIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar4R.png"))); // NOI18N

        labelIcono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar1R.png"))); // NOI18N

        botonSeleccionar1.setText("Seleccionar");
        botonSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionar1ActionPerformed(evt);
            }
        });

        botonSeleccionar2.setText("Seleccionar");
        botonSeleccionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionar2ActionPerformed(evt);
            }
        });

        botonSeleccionar3.setText("Seleccionar");
        botonSeleccionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionar3ActionPerformed(evt);
            }
        });

        botonSeleccionar4.setText("Seleccionar");
        botonSeleccionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIcono4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSeleccionar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIcono3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSeleccionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSeleccionar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIcono3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcono4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeleccionar1)
                    .addComponent(botonSeleccionar2)
                    .addComponent(botonSeleccionar3)
                    .addComponent(botonSeleccionar4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionar1ActionPerformed
        //Establece como atributo el primer icono al jugador y cierra la pestaña
        jugador.setIcono(new ImageIcon("/imagenes/avatar1R.png"));
        dispose();
    }//GEN-LAST:event_botonSeleccionar1ActionPerformed

    private void botonSeleccionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionar2ActionPerformed
        //Establece como atributo el segundo icono al jugador y cierra la 
        //pestaña
        jugador.setIcono(new ImageIcon("/imagenes/avatar2R.png"));
        dispose();
    }//GEN-LAST:event_botonSeleccionar2ActionPerformed

    private void botonSeleccionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionar3ActionPerformed
        //Establece como atributo el tercer icono al jugador y cierra la pestaña
        jugador.setIcono(new ImageIcon("/imagenes/avatar3R.png"));
        dispose();
    }//GEN-LAST:event_botonSeleccionar3ActionPerformed

    private void botonSeleccionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionar4ActionPerformed
        //Establece como atributo el cuarto icono al jugador y cierra la pestaña
        jugador.setIcono(new ImageIcon("/imagenes/avatar4R.png"));
        dispose();
    }//GEN-LAST:event_botonSeleccionar4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSeleccionar1;
    private javax.swing.JButton botonSeleccionar2;
    private javax.swing.JButton botonSeleccionar3;
    private javax.swing.JButton botonSeleccionar4;
    private javax.swing.JLabel labelIcono1;
    private javax.swing.JLabel labelIcono2;
    private javax.swing.JLabel labelIcono3;
    private javax.swing.JLabel labelIcono4;
    // End of variables declaration//GEN-END:variables
}
