package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaHistoriales {
    public ArrayList<Historial> ListaHistoriales = new ArrayList();
    public ListaHistoriales(){
        ListaHistoriales = new ArrayList<>();
    }
    public void AddHistorial(Historial historial){
        ListaHistoriales.add(historial);
    }
    public void ImprimirLista() {
        for (Historial historial:ListaHistoriales) {
            System.out.println("El Alumno:"+historial.getAlumno().getNombre()+" ID del Alumno: "+historial.getAlumno().getId());
            System.out.println("Pertenece al campus:"+historial.getCampus().getNombre());
            System.out.println("Carrera:"+historial.getCarrera().getNombre());
            System.out.println("Periodo:"+historial.getPeriodo().getDescripcion()+"Con fecha de inicio: "+historial.getPeriodo().getFechaInicio()+" Finaliza: "+historial.getPeriodo().getFechaFin());
            System.out.println("Clases ingresadas:");
            for (Clase clase: historial.getClases()) {
                System.out.println(" Nombre de la clase:"+clase.getNombre());
                System.out.println("Unidades Valorativas:"+clase.getUnidadesValorativas());
                System.out.println("Notas del Primer Parcial:");
                System.out.println(" -Acumulativo Primer Parcial:"+clase.getNA1());
                System.out.println(" -Nota de Examen Primer Parcial:"+clase.getNE1());
                System.out.println("Notas Segundo Parcial:");
                System.out.println(" -Acumulativo Segundo Parcial:"+clase.getNA2());
                System.out.println(" -Nota de Examen Segundo Parcial:"+clase.getNE2());
                System.out.println("Notas Tercer Parcial:");
                System.out.println(" -Acumulativo Tercer Parcial:"+clase.getNA3());
                System.out.println(" -Notas Segundo Parcial:"+clase.getNE3());
                System.out.println(" -Nota de Reposicion de la clase:"+clase.getNR()+"\n Nota de Examen Primer Parcial:"+clase.getNE1());

            }

        }

    }
}
