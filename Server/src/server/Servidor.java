/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    private static int numJugador=-1;
    
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket sc;
            
            System.out.println("Servidor iniciado");
            while(true){
                // Espero la conexion del cliente
                sc = server.accept();
                numJugador++;
                try{
                    InputStream is = sc.getInputStream();
                    DataInputStream dis = new DataInputStream(is);
                    OutputStream os = sc.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    
                // Inicio el hilo
                ServidorHilo hilo = new ServidorHilo(dis, dos, numJugador);
                hilo.start();
                } catch(SocketException se){
                    System.out.println("Salió el jugador " + numJugador);
                }
                //Comentario
                System.out.println("Creada la conexion con el cliente: " + numJugador);
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
