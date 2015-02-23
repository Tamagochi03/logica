/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estados;

import java.awt.Label;
import logica.MaquinaTamagochi;

/**
 *
 * @author Shinsnake
 */
public class Normal extends EstadoGeneral implements Estado, Runnable {
    public Normal(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("No tengo mucho sueño");
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("A jugar!");
        getTama().setEstado(getTama().getJugando());
        Thread hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("No tengo mucha hambre");
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
            getTama().setEstado(getTama().getNormal());
        }catch (Exception e){
            System.out.println("Error al dormir el hilo"); //TODO: delete , este metodo es solo para debug del manejo de hilos
        }
    }
}
