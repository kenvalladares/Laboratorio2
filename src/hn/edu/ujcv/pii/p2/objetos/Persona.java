package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Persona {
    private long    Id;
    private String  Nombre;

    public Persona() {
    }

    public Persona(long Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;

    }

    public long getId() {
        return Id;
    }
    public String getNombre(){
        return Nombre;
    }

    public void setId(long Id){

        this.Id = Id;
    }
    public void setNombre(String Nombre){

        this.Nombre = Nombre;
    }
    public String toString() {
        return "Nombre:".concat("\t").concat(this.getNombre()).concat("\n").concat("ID:").concat("\t").concat(String.valueOf(this.getId()));
    }
}