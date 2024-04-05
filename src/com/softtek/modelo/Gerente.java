package com.softtek.modelo;

public class Gerente extends Empleado {
    // Attributos
    private double bono;

    // Métodos
    public double calcularNomina() {
        double dinero = (bono + sueldo) * PORCENTAJE;
        return dinero;
    }
}
