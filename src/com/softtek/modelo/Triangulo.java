package com.softtek.modelo;

public class Triangulo extends Figura {

    // Attributos
    private double base;
    private double altura;

    // Constructores


    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int i, int i1) {

    }

    public Triangulo() {

    }

    // Métodos
    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public int mostrarPosicion(int x, int y) {
        return 0;
    }


    // Setters y Getters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
