package hn.edu.ujcv.pii.p2.objetos;

import hn.edu.ujcv.pii.p2.objetos.General;

import java.util.Scanner;

public  class Ingenieria extends General {
    private int NotaProyecto;
    public Ingenieria(){
    }
    public Ingenieria(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NE1, int NA2, int NE2, int NA3, int NE3, int NR, int NotaProyecto) {
        super(TodasCarreras, Id, Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2, NA3, NE3, NR);
        this.NotaProyecto = NotaProyecto;
    }

    public int getNotaProyecto() {
        return NotaProyecto;
    }

    public void setNotaProyecto(int NotaProyecto) {
        this.NotaProyecto = NotaProyecto;
    }
    public void PedirNotas(Scanner teclado) {
        super.PedirNotas(teclado);
        System.out.println("Ingrese nota proyecto: ");
        this.NotaProyecto = teclado.nextInt();
    }

    public double CalcularNotaFinal() {
        return (double)(this.getNA1() + this.getNE1() + this.getNA2() + this.getNE2() + this.getNA3() + this.getNE3() + this.getNR() + this.NotaProyecto);
    }
    @Override
    public String toString() {
        return super.toString().concat("");
    }
}
