package client;

import frames.Login;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteHilo extends Thread {
    private static String mensaje;
    private static DataInputStream in;
    private static DataOutputStream out;
    public static int numJugador;

    public ClienteHilo() {
        
    }

    @Override
    public void run() {

        while (true) {
            
            try {
                mensaje=in.readUTF();
                if(mensaje.startsWith("nombre ")){
                    System.out.println(mensaje.substring(7));
                }else if(mensaje.startsWith("num ")){
                    numJugador=Integer.parseInt(mensaje.substring(4));
                    System.out.println(numJugador);
                //Cuando llegue un mensaje que empiece con el número del jugador
                }else if(mensaje.startsWith(String.valueOf(numJugador))){
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
            }catch (NullPointerException ne){
                
            }

        }

    }
    
    public static void enviarAlServidor(String mensaje) throws IOException{
        out.writeUTF(mensaje);
    }
    
    public static void entrarAlServidor(String direccion) throws IOException{
        Socket sc = new Socket(direccion, 5000);
        DataInputStream in = new DataInputStream(sc.getInputStream());
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());
        ClienteHilo.in = in;
        ClienteHilo.out=out;
    }
    
}
