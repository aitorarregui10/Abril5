package com.softtek.modelo;

public class Bateria extends InstrumentoMusical{

    // Attributos
    private int noPlatillos;

    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public Bateria(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

    // Métodos
    public String emitirSonido(String sonido) {
        return sonido;
    }
}
