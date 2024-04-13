package com.softtek.modelo;

public class Gerente extends Empleado {
    // Attributos
    private double bono;

    // Métodos
    public double calcularNomina() {
        return super.calcularNomina() + bono * PORCENTAJE;
    }
}
