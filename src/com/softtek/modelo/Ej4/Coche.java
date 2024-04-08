package com.softtek.modelo.Ej4;

public class Coche {

    private String matricula;
    private String modelo;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    public void setMatricula(String matricula) {
        matricula = this.matricula;
    }

    public void setModelo(String modelo) {
        modelo = this.modelo;
    }

}