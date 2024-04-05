package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical{

    // Attributos
    private String tipoCuerdas;


    // Métodos
    public String emitirSonido(String sonido) {
        return sonido;
    }

    // Constructor


    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    // Getters and Setters
    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
