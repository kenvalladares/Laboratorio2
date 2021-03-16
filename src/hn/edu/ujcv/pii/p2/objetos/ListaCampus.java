package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCampus {
    private ArrayList<Campus> ListaCampus = new ArrayList();
    public ListaCampus(){
    }
    public void AddCampus(Campus Campus){
        ListaCampus.add(Campus);
    }
    public int Cantidad() {
        return this.ListaCampus.size();
    }
    public Campus BuscarCampus(long id) {
        Iterator busc1 = this.ListaCampus.iterator();

        Campus campus;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            campus = (Campus)busc1.next();
        } while((long)campus.getId() != id);

        return campus;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaCampus.iterator();

        while(imprimir1.hasNext()) {
            Campus campus = (Campus)imprimir1.next();
            System.out.println(campus.toString());
        }

    }

}