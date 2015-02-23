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
public class Durmiendo extends EstadoGeneral implements Estado {
    public Durmiendo(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("ZzZzZzZz....ñam...ñam");
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("No me despiertes!");
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("ZzZzZz...comida...ñam");
    }
}
