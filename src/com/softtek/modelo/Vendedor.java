package com.softtek.modelo;

public class Vendedor extends Empleado {
    // Attributos
    private double ventas;
    private double comision;

    // Métodos
    public double calcularNomina() {
        double dinero = ((ventas * comision) + sueldo) * PORCENTAJE;
        return dinero;
    }
}
