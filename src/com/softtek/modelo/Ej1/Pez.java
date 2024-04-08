package com.softtek.modelo.Ej1;

public class Pez extends Animal {
    @Override
    public void comer() {
        System.out.println("El pez se alimenta.");
    }

    @Override
    public void moverse() {
        System.out.println("El pez nada en el agua.");
    }

}