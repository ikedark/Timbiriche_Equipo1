package modelo;

import Dominio.Jugador;
import vista.IFrame;
import vista.Lobby;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Game;

public class ClienteHilo extends Thread {
    private static String mensaje;
    public static int numJugador;
    public static Jugador jugador,jugadores[];
    public static DataInputStream dis;
    public static DataOutputStream dos;
    private IFrame frame;
    private final ArrayList<String>numeros=new ArrayList();
    private String boton;
            
    public ClienteHilo() {
        
    }

    @Override
    public void run() {
        numeros.add("0");
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        while (true) {
            
            try {
                mensaje=dis.readUTF();
                System.out.println(mensaje);
                    if(mensaje.startsWith("num ")){
                        numJugador=Integer.parseInt(mensaje.substring(4));
                    //Cuando llegue un mensaje que empiece con el número del jugador
                    }else if(mensaje.equalsIgnoreCase("jugador")){
                        frame=new Lobby(jugador);
                        frame.hacerVisible();
                        frame.bloquearTodosMenos(numJugador);
                    }else if(numeros.contains(mensaje)){
                        frame.votar(Integer.parseInt(mensaje));
                    }else if(mensaje.equalsIgnoreCase("game")){
                        frame= new Game(jugadores);
                        frame.hacerVisible();
                    }else if(mensaje.startsWith("boton ")){
                        boton=mensaje.substring(6);
                        frame.colorearBoton(boton);
                    }
            }catch(NullPointerException ne){
                
            } catch (IOException ex) {
                Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    public static void enviarMensajeServidor(String mensaje) throws IOException{
        try{
            dos.writeUTF(mensaje);
            dos.flush();
        }catch(NullPointerException ne){
        
        }
    }
    
    public static void entrarAlServidor(String direccion) throws IOException{
        Socket sc = new Socket(direccion, 5000);
        InputStream is = sc.getInputStream();
        dis = new DataInputStream(is);
        OutputStream os = sc.getOutputStream();
        dos = new DataOutputStream(os);
    }
    
}
