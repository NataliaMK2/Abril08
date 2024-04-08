package com.softtek.persistencia;
import  com.softtek.modelo.Ej6.*;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
