package com.softtek.modelo;

public class Figura {
    // Attributos
    protected int x;
    protected int y;


    // Métodos
    public double calcularArea() {
        double area=x*y;
        return area;
    }
    public String mostrarPosicion(String posicion) {
           return posicion;
    }

    // Constructores

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }

    // Setter y Getters


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
