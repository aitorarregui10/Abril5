package com.softtek.modelo;

public class Flauta extends InstrumentoMusical{

    // Attributos
    private String material;

    // Constructor
    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta(String material) {
        this.material = material;
    }

    // Métodos
    public String emitirSonido(String sonido) {
        return sonido;
    }
}
