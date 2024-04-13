package com.softtek.modelo;

public abstract class Figura {
    // Atributos
    protected int x;
    protected int y;

    //Constructores
    public Figura(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public Figura() {

    }


    // Métodos
    public abstract double calcularArea();

    public abstract int mostrarPosicion(int x, int y);

/*    // Constructores



    public Figura() {
    }
*/

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
