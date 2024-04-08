package com.softtek.presentacion.Ej3;

import com.softtek.modelo.Ej3.Coche;
import com.softtek.modelo.Ej3.Conductor;

public class EjemploUso3 {

    public static void main(String[] args) {

        Coche coche = new Coche(80);
        Conductor conductor = new Conductor(coche);

        conductor.conducir();
    }}