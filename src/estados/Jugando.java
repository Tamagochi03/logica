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
public class Jugando extends EstadoGeneral implements Estado{
    public Jugando(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("Aún quiero jugar!");
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("Qué divertido!");
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("No gracias, me podría doler la barriga");
    }
}
