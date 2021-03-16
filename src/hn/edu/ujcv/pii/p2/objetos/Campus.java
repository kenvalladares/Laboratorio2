package hn.edu.ujcv.pii.p2.objetos;

import java.sql.Date;

public class Campus {
    private int     Id;
    private String  Nombre;
    private String  Direccion;
    private String   FechaInicio;

    public Campus(){
    }
    public Campus(int Id, String Nombre, String Direccion, String FechaInicio){
        this.Id = Id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaInicio = FechaInicio;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getFechaInicio(){
        return FechaInicio;
    }
    public int getId(){
        return Id;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void setFechaInicio(String FechaInicio){
        this.FechaInicio = FechaInicio;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String toString() {
        return " \n Nombre del Campus: " + this.getNombre() + "\n ID: " + this.getId() + "\n Direccion del Campus: " + this.Direccion + "\n Fecha Inicio : " + this.FechaInicio + "\n";
    }
}