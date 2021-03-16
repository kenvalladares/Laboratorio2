package hn.edu.ujcv.pii.p2.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPeriodos {
    private ArrayList<Periodo> ListaPeriodos = new ArrayList();
    public ListaPeriodos(){
    }
    public void AddPeriodo(Periodo Periodo){
        ListaPeriodos.add(Periodo);
    }
    public int Cantidad() {
        return this.ListaPeriodos.size();
    }
    public Periodo Buscar(long id) {
        Iterator busc1 = this.ListaPeriodos.iterator();

        Periodo periodo;
        do {
            if (!busc1.hasNext()) {
                return null;
            }

            periodo = (Periodo)busc1.next();
        } while((long)periodo.getId() != id);

        return periodo;
    }
    public void ImprimirLista() {
        Iterator imprimir1 = this.ListaPeriodos.iterator();

        while(imprimir1.hasNext()) {
            Periodo periodo = (Periodo)imprimir1.next();
            System.out.println(periodo.toString());
        }

    }
}
