package logica;

import estados.*;
import estados.Estado;
import java.awt.Label;
import javax.media.j3d.TransformGroup;

public class Tamagochi {
    Estado cansado;
    Estado hambriento;
    Estado durmiendo;
    Estado comiendo;
    Estado jugando;
    Estado muerto;
    Estado normal;
    
    TransformGroup tg;
    Label mensaje;
    
    int energia;
    Estado estadoActual;
    

    public Tamagochi(TransformGroup tg, Label mensaje) {
        cansado = new Cansado(this);
        hambriento = new Hambriento(this);
        durmiendo = new Durmiendo(this);
        comiendo = new Comiendo(this);
        jugando = new Jugando(this);
        muerto = new Muerto(this);
        normal = new Normal(this);
        this.energia = 100;
        this.estadoActual = normal;
        this.tg = tg;
        this.mensaje = mensaje;
    }
        
    public void dormir() {
        estadoActual.dormir();
    }

    public void comer() {
        estadoActual.comer();
    }

    public void jugar() {
        estadoActual.jugar();
    }
    
    void setState(Estado estado) {
	this.estadoActual = estado;
    }

    public Estado getCansado() {
        return cansado;
    }

    public Estado getHambriento() {
        return hambriento;
    }

    public Estado getDurmiendo() {
        return durmiendo;
    }

    public Estado getComiendo() {
        return comiendo;
    }

    public Estado getJugando() {
        return jugando;
    }

    public Estado getMuerto() {
        return muerto;
    }

    public Estado getNormal() {
        return normal;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public int getEnergia() {
        return energia;
    }

    public TransformGroup getTg() {
        return tg;
    }

    public void setTg(TransformGroup tg) {
        this.tg = tg;
    }

    public Label getMensaje() {
        return mensaje;
    }

    public void setMensaje(Label mensaje) {
        this.mensaje = mensaje;
    }
      
}
    

