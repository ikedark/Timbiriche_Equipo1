/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Dominio.Jugador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
/**
 *
 * @author Fernando
 */
public class ServidorHilo extends Thread {
    private static String mensaje;
    private static DataInputStream dis;
    private static DataOutputStream dos;
    private static int numJugador;
    
    
    public ServidorHilo(DataInputStream dis, DataOutputStream dos,int numJugador) {
        this.dis = dis;
        this.dos = dos;
        this.numJugador=numJugador;
    }
    
    @Override
    public void run() {
        File f = new File("info.txt");
        
        try {
            dos.writeUTF("num " + numJugador);
            dos.flush();
            escribirEnArchivo(f, numJugador);
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (true) {
            try{
                mensaje = dis.readUTF();
                System.out.println(mensaje);
                if(mensaje.startsWith("voto ")){
                    System.out.println(mensaje.substring(5));
                }else if(mensaje.startsWith("Creada") || mensaje.startsWith("Se desconecto")){
                        
                }else{
                    dos.writeUTF(mensaje);
                    dos.flush();
                }
            } catch(SocketException se){
                System.out.println("Se desconecto: " + numJugador);
                break;
            } catch (IOException ex) {
                Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void escribirEnArchivo(File f,int numUsuario) throws IOException{
        FileWriter fw =  new FileWriter(f,true);
        fw.write(numUsuario + "-"+"\r\n");
        fw.close();
    }
    
    
}
