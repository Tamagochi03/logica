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
public class Muerto extends EstadoGeneral implements Estado {

    public Muerto(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("...");
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("...");
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("...");
    }
}
