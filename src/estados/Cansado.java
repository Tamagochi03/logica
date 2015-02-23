/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

import java.awt.Label;
import logica.MaquinaTamagochi;
import utileria.Utileria;

/**
 *
 * @author Shinsnake
 */
public class Cansado extends EstadoGeneral implements Estado {

    public Cansado(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("Si! a dormir!");
        getTama().setEstado(getTama().getDurmiendo());
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("No tengo ganas de jugar");
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("Estoy cansado no hambriento!");
    }
}
