package com.softtek.modelo;

public class Cuadrado extends Figura {

    // Attributos
    private double lado;

    // Constructor


    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado(int i) {
        super();
    }

    public Cuadrado() {

    }

    // Métodos
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public int mostrarPosicion(int x, int y) {
        return 0;
    }
    // Getters y Setters


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
