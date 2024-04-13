package com.softtek.modelo;

public abstract class InstrumentoMusical {

    // Attributos
    protected String marca;


    // Métodos
    public abstract String emitirSonido(String sonido);

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
