package com.softtek.modelo;

public class Operador extends Empleado {
    // Attributos
    private int piezas;
    private double incentivo;

    // Métodos
    public double calcularNomina() {
        return super.calcularNomina() + (incentivo * piezas);
    }
}
