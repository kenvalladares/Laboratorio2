package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras = new ArrayList();
    public ListaCarreras(){
    }

    public void AddCarrera(Carrera Carreras){
        ListaCarreras.add(Carreras);
    }
    public int Cantidad() {
        return this.ListaCarreras.size();
    }
    public Carrera Buscar(long id) {
        Iterator busc1 = this.ListaCarreras.iterator();

        Carrera carrera;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            carrera = (Carrera)busc1.next();
        } while((long)carrera.getId() != id);

        return carrera;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaCarreras.iterator();

        while(imprimir1.hasNext()) {
            Carrera carrera = (Carrera)imprimir1.next();
            System.out.println(carrera.toString());
        }

    }
}