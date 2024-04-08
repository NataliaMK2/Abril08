package com.softtek.modelo.Ej5;

public class Director implements Empleado{
 private Informe informe;
        public Director(Informe informe) {
            this.informe=informe;
        }

    @Override
    public String getTareas() {
        return "tareas del Director";
    }

    @Override
    public String getInforme() {
        return "informe del director";
    }
}
