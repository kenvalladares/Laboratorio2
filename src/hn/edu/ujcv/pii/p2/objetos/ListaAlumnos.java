package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlumnos {
    private ArrayList<Alumno> ListaAlumnos = new ArrayList();
    public ListaAlumnos(){
    }
    public void addAlumno(Alumno Alumno){
        ListaAlumnos.add(Alumno);
    }
    public int Cantidad() {
        return this.ListaAlumnos.size();
    }
    public Alumno BuscarAlumno(long Id) {
        Iterator busc1 = this.ListaAlumnos.iterator();

        Alumno alumno1;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            alumno1 = (Alumno)busc1.next();
        } while(alumno1.getId() != Id);

        return alumno1;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaAlumnos.iterator();

        while(imprimir1.hasNext()) {
            Alumno alumno = (Alumno)imprimir1.next();
            System.out.println("Nombre del Alumno: " + alumno.getNombre() + "  \n ID: " + alumno.getId() + " \n Numero de Cuenta: " + alumno.getCuenta());
        }

    }
}
