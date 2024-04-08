package com.softtek.modelo.Ej3;

public class Coche extends iVehiculo {
    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public void moverse() {
        System.out.println("Solo en caso de tener gasolina en el deposito");
    }
}
