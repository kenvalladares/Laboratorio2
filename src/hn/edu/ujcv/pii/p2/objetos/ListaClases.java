package hn.edu.ujcv.pii.p2.objetos;

import hn.edu.ujcv.pii.p2.objetos.Clase;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaClases {
     private ArrayList<Clase> ListaClases = new ArrayList();
    public ListaClases(){
    }
    public void AddClase(Clase Clase){
        ListaClases.add(Clase);
    }
    public int Cantidad() {
        return this.ListaClases.size();
    }

    public Clase Buscar(long id) {
        Iterator busc1 = this.ListaClases.iterator();

        Clase clase;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            clase = (Clase)busc1.next();
        } while((long)clase.getId() != id);

        return clase;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaClases.iterator();

        while(imprimir1.hasNext()) {
            Clase clase = (Clase)imprimir1.next();
            System.out.println(clase.toStringLineal());
        }

    }
}