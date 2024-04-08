package com.softtek.persistencia;
import  com.softtek.modelo.Ej6.*;

import com.softtek.persistencia.IDAO;

public class AccesoDesarrollo implements IDAO {
    @Override
    public String insertar(Cliente c1) {
        return c1.toString();
    }
}