package hn.edu.ujcv.pii.p2.objetos;

import hn.edu.ujcv.pii.p2.objetos.Clase;

public class Avanzada extends Clase {
    private int ValorVinculacion;
    private int TieneVinculacion;
    public Avanzada(){
    }
    public Avanzada(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NE1, int NA2, int NE2, int NA3, int NE3, int NR, int TieneVinculacion, int ValorVinculacion) {
        super(Id, Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2, NA3, NE3, NR);
        this.TieneVinculacion = TieneVinculacion;
        this.ValorVinculacion = ValorVinculacion;
    }

    public int getValorVinculacion() {
        return ValorVinculacion;
    }

    public void setValorVinculacion(int ValorVinculacion) {
        this.ValorVinculacion = ValorVinculacion;
    }
    public int getTieneVinculacion() {
        return this.TieneVinculacion;
    }
    public void setTieneVinculacion(int TieneVinculacion) {
        this.TieneVinculacion = TieneVinculacion;
    }
@Override
    public String toString() {
        return super.toString().concat("");
    }
    public double CalcularNotaFinal() {
        return (double)(this.getNA1() + this.getNA2() + this.getNA3() + this.getNE1() + this.getNE2() + this.getNE3() + this.getNR());
    }
    public String toStringLineal() {
        return "Clase (" + this.getId() + ") - " + this.getNombre() + " Tiene Vinculacion: " + this.ValorVinculacion + " UV: " + this.getUnidadesValorativas() + "\n";
    }
}