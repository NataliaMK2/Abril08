package com.softtek.modelo.Ej5;

    public class Jefe implements Empleado {
        private Informe informe;
        private String empresa;

        public Jefe(Informe informe) {
            this.informe = informe;
        }

        public Jefe(Informe informe, String empresa) {
            this.informe = informe;
            this.empresa = empresa;
        }

        @Override
        public String getTareas() {
            return "Liderar y supervisar el equipo";
        }

        public void setInforme(Informe informe) {
            this.informe = informe;
        }

        public String getInforme() {
            return informe.getInforme();
        }
    }
