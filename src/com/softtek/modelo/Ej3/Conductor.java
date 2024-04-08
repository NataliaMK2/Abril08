package com.softtek.modelo.Ej3;

public class Conductor {
    private iVehiculo vehiculo;
    private int deposito;

    public Conductor(iVehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.deposito = 50;
    }

    public void conducir() {
        if (deposito > 0) {
            vehiculo.moverse();
        } else {
            System.out.println("No se puede conducir porque no hay gasolina");
        }
    }
}

