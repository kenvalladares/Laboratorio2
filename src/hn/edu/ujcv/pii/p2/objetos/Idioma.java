package hn.edu.ujcv.pii.p2.objetos;

import hn.edu.ujcv.pii.p2.objetos.General;

import java.util.Scanner;

public class Idioma extends General {
    private int NotaLaboratorio;
    public Idioma(){
    }
    public Idioma(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NE1, int NA2, int NE2, int NA3, int NE3, int NR, int NotaLaboratorio) {
        super(TodasCarreras, Id, Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2, NA3, NE3, NR);
        this.NotaLaboratorio = NotaLaboratorio;
    }

    public int getNotaLaboratorio() {
        return NotaLaboratorio;
    }

    public void setNotaLaboratorio(int NotaLaboratorio) {
        this.NotaLaboratorio = NotaLaboratorio;
    }
    public void PedirNotas(Scanner teclado) {
        super.PedirNotas(teclado);
        System.out.println("Ingrese nota Laboratorio");
        this.NotaLaboratorio = teclado.nextInt();
    }
    @Override
    public String toString() {
        return super.toString().concat("Ingrese la nota del laboratorio ".concat(String.valueOf(this.getNotaLaboratorio())));
    }
    public double CalcularNotaFinal() {
        return (double)(this.getNA1() + this.getNE1() + this.getNA2() + this.getNE2() + this.getNA3() + this.getNE3() + this.getNR() + this.NotaLaboratorio);
    }
}