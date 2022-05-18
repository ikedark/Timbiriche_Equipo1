/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Login;
import modelo.ClienteHilo;
import vista.IFrame;

/**
 *
 * @author Usuario
 */
public class Controlador {
    ClienteHilo ch;
    IFrame login;
    public Controlador(ClienteHilo ch,IFrame login){
        this.ch=ch;
        this.login=login;
    }
    
    public void arrancar() throws InterruptedException{
        login.hacerVisible();
        ch.start();
        ch.join();
    }
    
}
