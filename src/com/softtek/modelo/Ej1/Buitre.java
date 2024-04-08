package com.softtek.modelo.Ej1;

public class Buitre extends Pajaro {
    @Override
    public void comer() {
        System.out.println("El buitre se alimenta");
    }

    @Override
    public void moverse() {
        System.out.println("El buitre vuela.");
    }

    @Override
    public void dormir() {
        return;
    }
}
