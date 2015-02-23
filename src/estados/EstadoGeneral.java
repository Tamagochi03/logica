/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estados;

import java.awt.Label;
import javax.media.j3d.TransformGroup;
import logica.MaquinaTamagochi;

/**
 *
 * @author Shinsnake
 */

//TODO: delete mensajePensamiento del constructor
public class EstadoGeneral {
    private TransformGroup tg;
    private MaquinaTamagochi tama;
    private int energia;
    private Label mensajePensamiento;

    public TransformGroup getTg() {
        return tg;
    }

    public void setTg(TransformGroup tg) {
        this.tg = tg;
    }

    public MaquinaTamagochi getTama() {
        return tama;
    }

    public void setTama(MaquinaTamagochi tama) {
        this.tama = tama;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Label getMensajePensamiento() {
        return mensajePensamiento;
    }

    public void setMensajePensamiento(Label mensajePensamiento) {
        this.mensajePensamiento = mensajePensamiento;
    }
    
    
}
