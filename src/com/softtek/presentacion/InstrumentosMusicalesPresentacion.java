package com.softtek.presentacion;

import com.softtek.modelo.Bateria;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.InstrumentoMusical;
import com.softtek.modelo.Flauta;






public class InstrumentosMusicalesPresentacion {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Fender", "Acero");
        InstrumentoMusical bataca = new Bateria("Yamaha", 27);
        InstrumentoMusical ham = new Flauta("Horner", "Material del que se forjan los sueños");

        //Matriz de tres elementos
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = guido;
        instrumentos[1] = bataca;
        instrumentos[2] = ham;

        //Bucle de la orquesta sinfónica

        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento instanceof Guitarra) {
                System.out.println(instrumento.emitirSonido("Sonido de la Guitarra chanana, chananaaaaa"));
            }else if (instrumento instanceof Bateria) {
                System.out.println(instrumento.emitirSonido("Sonido de la Bateria atun con pan,atunconpan tucutú"));
            }else if (instrumento instanceof Flauta) {
                System.out.println(instrumento.emitirSonido("Sonido de la Flauta fiuuuu fiuuuuaaa"));
            }
        }
    }
}
