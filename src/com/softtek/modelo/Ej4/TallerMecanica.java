package com.softtek.modelo.Ej4;

public class TallerMecanica extends iTaller {
    public TallerMecanica(){}
    @Override
    public String reparar(Coche c) {
        return "reparar coche " + c.getMatricula();
    }
}

