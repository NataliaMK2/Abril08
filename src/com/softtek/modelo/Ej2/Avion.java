package com.softtek.modelo.Ej2;

public class Avion extends Vehiculo implements ObjetoVolador {

    @Override
    public void despegar() {
        System.out.println("El avión:  despega");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión:  aterriza");
    }

    @Override
    public void volar() {
        System.out.println("El avión vuela");
    }
}
