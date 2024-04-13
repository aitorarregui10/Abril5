package com.softtek.modelo;
import java.time.LocalDate;
import java.time.Period;


public class ProductoPerecedero extends Producto {

    // Atributos
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    // Métodos
    public int tiempoConsumicion() {
        return Period.between(fFabricacion, fCaducidad).getDays();
    }
}
