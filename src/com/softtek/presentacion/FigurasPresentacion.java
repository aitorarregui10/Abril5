package com.softtek.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;


public class FigurasPresentacion {

    public static void main(String[] args) {


        //Intancia cPeque con setters
        Cuadrado cPeque = new Cuadrado (4);
            cPeque.setLado(5.0);

        // Instancia cMediano con constructor

        Cuadrado cMediano = new Cuadrado(10,10,10);

        //Intancia tPeque con setters
        Triangulo tPeque = new Triangulo(5,8);
        tPeque.setBase(5.0);
        tPeque.setAltura(7.0);

        // Instancia tMediano con constructor

        Triangulo tMediano = new Triangulo(10, 15,10, 15);

        //Matriz de figuras
        Figura[] figuras = new Figura[4];
        figuras[0] = cPeque;
        figuras[1] = cMediano;
        figuras[2] = tPeque;
        figuras[3] = tMediano;

        // Bucle for each calcular area de c/u
        for (Figura figura : figuras) {
            double area = figura.calcularArea();
            if (figura instanceof Cuadrado) {
                if (((Cuadrado) figura).getLado() == cPeque.getLado()) {
                    System.out.println("El área de la figura cPeque es: " + area);
                } else if (((Cuadrado) figura).getLado() == cMediano.getLado()) {
                    System.out.println("El área de la figura cMediano es: " + area);
                }
            } else if (figura instanceof Triangulo) {
                if (((Triangulo) figura).getBase() == tPeque.getBase() && ((Triangulo) figura).getAltura() == tPeque.getAltura()) {
                    System.out.println("El área de la figura tPeque es: " + area);
                } else if (((Triangulo) figura).getBase() == tMediano.getBase() && ((Triangulo) figura).getAltura() == tMediano.getAltura()) {
                    System.out.println("El área de la figura tMediano es: " + area);
                }
            }
        }
    }
}
