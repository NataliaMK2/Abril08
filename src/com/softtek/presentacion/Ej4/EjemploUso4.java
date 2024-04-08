package com.softtek.presentacion.Ej4;

import com.softtek.modelo.Ej4.*;

public class EjemploUso4 {
    public static void main(String[] args) {
        Coche miCoche = new Coche("1234ABC", "Ibiza");
        TallerMecanica tallerMecanica = new TallerMecanica();
        TallerPintura tallerPintura = new TallerPintura();
        SeguroCoche miSeguro = new SeguroCoche(tallerMecanica, "seguro");

        System.out.println(tallerMecanica.reparar(miCoche));
        System.out.println(tallerPintura.reparar(miCoche));
        System.out.println(miSeguro.reparar(miCoche));
    }
}
