/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.Controlador;
import modelo.ClienteHilo;
import vista.IFrame;
import vista.Login;

public class Cliente {

    public static void main(String[] args) throws InterruptedException {
        ClienteHilo ch=new ClienteHilo();
        IFrame login= new Login();
        
        Controlador controlador =new Controlador(ch, login);
        
        controlador.arrancar();
        
    }
    
}
