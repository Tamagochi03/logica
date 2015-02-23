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
public class Hambriento extends EstadoGeneral implements Estado{
    public Hambriento(MaquinaTamagochi tamagochi, Label mensajePensamiento) {
        setTama(tamagochi);
        setMensajePensamiento(mensajePensamiento);
    }

    @Override
    public void dormir() {
        getMensajePensamiento().setText("Tengo mucha hambre, no puedo dormir...");
    }

    @Override
    public void jugar() {
        getMensajePensamiento().setText("No tengo energías para jugar...");
    }

    @Override
    public void comer() {
        getMensajePensamiento().setText("Por fin! Comida!");
        getTama().setEstado(getTama().getHambriento());
    }
}
