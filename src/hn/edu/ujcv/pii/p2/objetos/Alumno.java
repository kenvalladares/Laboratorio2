package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Alumno extends Persona {
    private long    Cuenta;

    public Alumno(){
    }
    public Alumno(long Cuenta, long Id, String Nombre){
        super(Id, Nombre);
        this.Cuenta = Cuenta;
    }
    public long getCuenta(){
        return Cuenta;
    }
    public void setCuenta(long Cuenta){
        this.Cuenta = Cuenta;
    }
    public String toString() {
        return super.toString().concat("\n").concat("Numero de Cuenta:").concat("\t").concat(String.valueOf(this.getCuenta()));
    }
}