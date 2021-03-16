package hn.edu.ujcv.pii.p2.objetos;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Periodo {
    private int Id;
    private String FechaInicio;
    private String FechaFin;
    private String Descripcion;

    public Periodo(){
    }
    public Periodo(int Id, String FechaInicio, String FechaFin, String Descripcion){
        this.Id =           Id;
        this.FechaInicio =  FechaInicio;
        this.FechaFin =     FechaFin;
        this.Descripcion =  Descripcion;
    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String getFechaInicio(){
        return FechaInicio;
    }
    public void setFechaInicio(String FechaInicio){
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin(){
        return FechaFin;
    }
    public void setFechaFin(String FechaFin){
        this.FechaFin = FechaFin;
    }

    public String getDescripcion(){
        return Descripcion;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public String toString() {
        return "ID del Periodo " + this.Id + "   Descripcion: " + this.Descripcion + " De " + (this.FechaInicio) + " Hasta " + (this.FechaFin);
    }

}

