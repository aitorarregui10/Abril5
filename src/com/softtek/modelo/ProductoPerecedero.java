package com.softtek.modelo;
import java.time.LocalDate;


public class ProductoPerecedero extends Producto {

    // Atributos
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    // Métodos
    public int tiempoConsumicion(int dia) {
        return dia;
    }

}
