package com.softtek.modelo.Ej1;

public class Pajaro extends Animal {
    @Override
    public void comer() {
        System.out.println("El pájaro come.");
    }

    @Override
    public void moverse() {
        System.out.println("El pájaro vuela.");
    }

    @Override
    public void dormir() {
        return;
    }
}