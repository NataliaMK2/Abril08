package com.softtek.modelo.Ej2;

public class Barcaza extends Vehiculo implements Nautico {
    @Override
    public void atracar() {
        System.out.println("La barcaza atraca");
    }

    @Override
    public void navegar() {
        System.out.println("La barcaza navega por el mar");
    }
}
