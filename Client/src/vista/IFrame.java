/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Usuario
 */
public interface IFrame {
    public void votar(int jugador);
    public void bloquearTodosMenos(int jugador);
    public void hacerVisible();
    public void colorearBoton(String boton);
}
