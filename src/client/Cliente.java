/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import frames.*;

public class Cliente {

    public static void main(String[] args) throws InterruptedException {
        
            Login login=new Login();
            login.setVisible(true);
            // ejecutamos el hilo
            ClienteHilo hilo = new ClienteHilo();
            hilo.start();
            hilo.join();
        
    }
    
}
