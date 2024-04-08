package com.softtek.modelo.Ej4;

public class SeguroCoche {

    private iTaller taller;
    private String aseguradora;

    public SeguroCoche(iTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche c) {
        return("reparación del coche " + c.getMatricula() + " con la aseguradora " + aseguradora);
    }

}