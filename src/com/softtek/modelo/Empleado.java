package com.softtek.modelo;

public class Empleado {
    // Attributos
    protected String nombre;
    protected int sueldo;
    protected double PORCENTAJE = 0.75;

    // Métodos
    public double calcularNomina() {
        double dinero = sueldo * PORCENTAJE;
        return dinero;
    }
}
