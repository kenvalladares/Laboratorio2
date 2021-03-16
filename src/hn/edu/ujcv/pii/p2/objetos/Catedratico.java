package hn.edu.ujcv.pii.p2.objetos;

import java.util.Date;

public class Catedratico extends Persona {
    private int Codigo;

    public Catedratico(){
    }
    public Catedratico(int Codigo, long Id, String Nombre){
        super((long)Id, Nombre);
        this.Codigo = Codigo;
    }
    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo( int Codigo){
        this.Codigo = Codigo;
    }
    public String toString() {
        return "Nombre del Catedratico " + this.getNombre() + " \n Codigo:" + this.Codigo + " \n Id:  " + this.getId() + "\n";
    }
}
