package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;

public class Historial implements IHistorial {
    private Alumno Alumno;
    private Campus Campus;
    private Carrera Carrera;
    private Periodo Periodo;
    ArrayList <Clase> Clases;
    public Historial(){
    }
    public Historial(Alumno Alumno, Campus Campus, Carrera Carrera, Periodo Periodo, ArrayList<Clase> Clase){
        this.Alumno = Alumno;
        this.Campus = Campus;
        this.Carrera = Carrera;
        this.Periodo = Periodo;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public Campus getCampus() {
        return Campus;
    }

    public Carrera getCarrera() {
        return Carrera;
    }

    public ArrayList<Clase> getClases() {
        return this.Clases;
    }

    public Periodo getPeriodo() {
        return Periodo;
    }

    public void setAlumno(Alumno alumno) {
        Alumno = alumno;
    }

    public void setCampus(Campus campus) {
        Campus = campus;
    }

    public void setCarrera(Carrera carrera) {
        Carrera = carrera;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.Clases = clases;
    }
    public void setPeriodo(Periodo periodo) {
        Periodo = periodo;
    }

    public double CalcularPromedio(double Promedio) {
        return 0.0F;
    }
}