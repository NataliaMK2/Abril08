package com.softtek.presentacion.Ej2;

import com.softtek.modelo.Ej2.Avion;
import com.softtek.modelo.Ej2.Barcaza;
import com.softtek.modelo.Ej2.Helicoptero;
import com.softtek.modelo.Ej2.Hidroavion;

public class EjemploUso2 {

        public static void main(String[] args) {

            Avion AvionEj2 = new Avion();
            AvionEj2.despegar();
            AvionEj2.volar();
            AvionEj2.aterrizar();

            Barcaza BarcazaEj2 = new Barcaza();
            BarcazaEj2.atracar();
            BarcazaEj2.navegar();

            Hidroavion HidroavionEj2 = new Hidroavion();
            HidroavionEj2.despegar();
            HidroavionEj2.volar();
            HidroavionEj2.aterrizar();
            HidroavionEj2.atracar();
            HidroavionEj2.navegar();

            Helicoptero HelicopteroEj2 = new Helicoptero();
            HelicopteroEj2.despegar();
            HelicopteroEj2.volar();
            HelicopteroEj2.aterrizar();
        }
    }
