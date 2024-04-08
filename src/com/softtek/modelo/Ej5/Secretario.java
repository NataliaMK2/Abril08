package com.softtek.modelo.Ej5;

public class Secretario implements Empleado{
    private Informe informe;
    private String empresa;
    private String email;


    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "tareas para el Secretario";
    }


    @Override
    public String getInforme() {
        return "informes para el Secretario";
    }
}

