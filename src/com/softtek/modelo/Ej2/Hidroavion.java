package com.softtek.modelo.Ej2;

public class Hidroavion extends Vehiculo implements ObjetoVolador, Nautico {

        @Override
        public void despegar() {
            System.out.println("El hidroavión:  despega");
        }

        @Override
        public void aterrizar() {
            System.out.println("El hidroavión:  aterriza");
        }

        @Override
        public void volar() {
            System.out.println("El hidroavión:  vuela");
        }

        @Override
        public void atracar() {
            System.out.println("El hidroavión atraca");
        }

        @Override
        public void navegar() {
            System.out.println("El hidroavión navega");
        }
    }


