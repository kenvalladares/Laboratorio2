package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCatedraticos {
    private ArrayList<Catedratico> ListaCatedraticos = new ArrayList();
    public ListaCatedraticos(){
    }
    public void AddCatedratico(Catedratico Catedratico){
        ListaCatedraticos.add(Catedratico);
    }
    public int Cantidad() {
        return this.ListaCatedraticos.size();
    }
    public Catedratico Buscar(long id) {
        Iterator busc1 = this.ListaCatedraticos.iterator();

        Catedratico catedratico;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            catedratico = (Catedratico)busc1.next();
        } while(catedratico.getId() != id);

        return catedratico;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaCatedraticos.iterator();

        while(imprimir1.hasNext()) {
            Catedratico catedratico = (Catedratico)imprimir1.next();
            System.out.println(catedratico.toString());
        }

    }

}