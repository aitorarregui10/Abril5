package com.softtek.modelo;

public class Triangulo extends Figura {

    // Attributos
    private double base;
    private double altura;


    // Métodos
    public double calcularArea() {
        double area = base*altura;
        return area;
    }

    // Constructores


    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
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
