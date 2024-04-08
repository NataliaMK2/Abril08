package com.softtek.presentacion.Ej6;
import com.softtek.modelo.Ej6.*;
import com.softtek.persistencia.AccesoDesarrollo;
import com.softtek.persistencia.AccesoProduccion;
import com.softtek.persistencia.ClienteDao;
import com.softtek.persistencia.IDAO;


public class EjemploUso6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Natalia", "12345678N");

        IDAO accesoDesarrollo = new AccesoDesarrollo();

        ClienteDao clienteDAODesarrollo = new ClienteDao(accesoDesarrollo);

        clienteDAODesarrollo.insertar(cliente);

        IDAO accesoProduccion = new AccesoProduccion();

        ClienteDao clienteDAOProduccion = new ClienteDao(accesoProduccion);

        System.out.println(clienteDAOProduccion.insertar(cliente));
    }
}


