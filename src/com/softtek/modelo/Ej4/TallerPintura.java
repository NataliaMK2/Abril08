package com.softtek.modelo.Ej4;


    public class TallerPintura implements iTaller {

        @Override
        public String reparar(Coche c) {
            return("pintando el coche " + c.getMatricula());
        }


}
