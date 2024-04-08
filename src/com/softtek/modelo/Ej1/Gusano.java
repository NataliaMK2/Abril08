package com.softtek.modelo.Ej1;

public class Gusano extends Animal {
    @Override
    public void comer() {
        System.out.println("El gusano se alimenta.");
    }

    @Override
    public void moverse() {
        System.out.println("se mueve por el suelo.");
    }
}