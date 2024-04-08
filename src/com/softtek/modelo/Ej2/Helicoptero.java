package com.softtek.modelo.Ej2;

public class Helicoptero extends Vehiculo implements ObjetoVolador {

    @Override
    public void despegar() {
        System.out.println("El helicóptero:  despega");
    }

    @Override
    public void aterrizar() {
        System.out.println("El helicóptero:  aterriza");
    }

    @Override
    public void volar() {
        System.out.println("El helicóptero:  vuela");
    }
}