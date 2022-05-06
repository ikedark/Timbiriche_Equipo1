/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Dominio.*;

/**
 *
 * @author itzel
 */
public class Principal extends javax.swing.JFrame {
    Jugador jugador;
    String puerto;
    /**
     * Creates new form Principal
     * @param jugador
     */
    public Principal(Jugador jugador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jugador=jugador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearPartida = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCrearPartida1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Principal");
        setName(""); // NOI18N

        btnCrearPartida.setText("Crear Partida");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCrearPartida1.setText("Unirse Partida");
        btnCrearPartida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartida1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearPartida1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnCrearPartida)
                .addGap(31, 31, 31)
                .addComponent(btnCrearPartida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //Este método abre un la pestaña lobby y cierra esta pestaña
    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        Lobby lobby = new Lobby(jugador);
        lobby.setVisible(true);
        String mensaje = "El jugador "+jugador.getNombre()+" se ha unido";
        lobby.mostrarMensaje(mensaje);
        for(int i = 1; i < 4;i++){
            mensaje = "El jugador "+lobby.jugadores[i].getNombre()+" se ha unido";
            lobby.mostrarMensaje(mensaje);
        }
        
        this.dispose();
        
    }//GEN-LAST:event_btnCrearPartidaActionPerformed
    //Este método retrocede a la pestaña LogIn con los atributos dle jugador y
    //cierra esta pestaña
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login login = new Login(jugador);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearPartida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearPartida1ActionPerformed
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnCrearPartida1;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
