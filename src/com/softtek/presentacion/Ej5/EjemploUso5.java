package com.softtek.presentacion.Ej5;

import com.softtek.modelo.Ej5.*;

public class EjemploUso5 {
    public static void main(String[] args) {
        Informe informeTrimestre1 = new InformeTrimestre1();
        Informe informeTrimestre2 = new InformeTrimestre2();

        Empleado director = new Director(informeTrimestre1);
        Empleado jefe = new Jefe(informeTrimestre2, "MiEmpresa");
        Empleado secretario = new Secretario();

        System.out.println("Tareas del Director: " + director.getTareas());
        System.out.println("Informe del Director: " + director.getInforme());

        System.out.println("Tareas del Jefe: " + jefe.getTareas());
        System.out.println("Informe del Jefe: " + jefe.getInforme());

        System.out.println("Tareas del Secretario: " + secretario.getTareas());
    }
}
