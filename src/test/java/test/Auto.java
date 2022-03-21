package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;
    int cantidadAsientos(){
        int cantidad = 0;
        for	(int i=0; i<asientos.length;i++) {
            if(asientos[i]!=null)
                cantidad=cantidad+1;
        }
        return cantidad;
    }
    String verificarIntegridad() {
        String verifi= "Las piezas no son originales";
        String autoV= "Auto original";
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null && asientos[i].registro != this.registro ) {
                return  verifi;
            }
        }
        if (this.registro != motor.registro) {
            return verifi;
        } else {
            return autoV;
        }

    }


}