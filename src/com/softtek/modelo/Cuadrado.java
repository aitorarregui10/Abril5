package com.softtek.modelo;

public class Cuadrado extends Figura{

    // Attributos
    private double lado;

    // Constructor


    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public Cuadrado() {
    }

    // Métodos
    public double calcularArea() {
        double area = lado*lado;
        return area;
    }
    // Getters y Setters


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
