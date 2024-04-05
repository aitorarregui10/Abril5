package com.softtek.modelo;

public class InstrumentoMusical {

    // Attributos
    protected String marca;


    // Métodos
    public String emitirSonido(String sonido) {
        return sonido;
    }

    // Constructor

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }
    public InstrumentoMusical() {
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
