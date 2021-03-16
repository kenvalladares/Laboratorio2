package hn.edu.ujcv.pii.p2.objetos;

public class Carrera {
    private int     Id;
    private String  Nombre;

    public Carrera(){
    }

    public Carrera(int Id, String Nombre){
        this.Id = Id;
        this.Nombre = Nombre;
    }
    public int getId(){
        return Id;
    }
    public String getNombre(){
        return Nombre = Nombre;
    }
    public void setId (int Id){
        this.Id = Id;
    }
    public void setNombre (String Nombre){
        this.Nombre = Nombre;
    }
    public String toString() {
        return "Carrera: " + this.Nombre + " - " +"ID:"+ this.Id + "\n";
    }
}
