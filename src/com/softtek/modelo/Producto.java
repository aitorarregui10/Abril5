package com.softtek.modelo;

public class Producto {
    // Attributos
    protected String nombre;
    protected int cantidad;
    protected double pvp;

    // Métodos
    public double cantidadAPagar() {
        return cantidad * pvp;
    }
}
