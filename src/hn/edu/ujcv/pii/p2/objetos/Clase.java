package hn.edu.ujcv.pii.p2.objetos;

import java.util.Scanner;

public class Clase {
    private int Id;
    private int NA1;
    private int NA2;
    private int NA3;
    private int NE1;
    private int NE2;
    private int NE3;
    private int NR;
    private String Nombre;
    private int UnidadesValorativas;


    public Clase(){
    }
    public Clase(int Id, String Nombre, int UnidadesValorativas, int NA1, int NE1, int NA2, int NE2, int NA3, int NE3, int NR){
        this.Id =   Id;
        this.NA1 =  NA1;
        this.NA2 =  NA2;
        this.NA3 =  NA3;
        this.NE1 =  NE1;
        this.NE2 =  NE2;
        this.NE3 =  NE3;
        this.NR =   NR;
        this.Nombre = Nombre;
        this.UnidadesValorativas = UnidadesValorativas;
    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public int getNA1(){
        return NA1;
    }
    public void setNA1(int NA1){
        this.NA1 = NA1;
    }
    public int getNA2(){
        return NA2;
    }
    public void setNA2(int NA2){
        this.NA2 = NA2;
    }
    public int getNA3(){
        return NA3;
    }
    public void setNA3(int NA3){
        this.NA3 = NA3;
    }
    public int getNE1(){
        return NE1;
    }
    public void setNE1(int NE1){
        this.NE1 = NE1;
    }
    public int getNE2(){
        return NE2;
    }
    public void setNE2(int NE2){
        this.NE2 = NE2;
    }
    public int getNE3(){
        return NE3;
    }
    public void setNE3(int NE3){
        this.NE3 = NE3;
    }
    public int getNR(){
        return NR;
    }
    public void setNR(int NR){
        this.NR = NR;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public int getUnidadesValorativas(){
        return UnidadesValorativas;
    }
    public void setUnidadesValorativas(int UnidadesValorativas){
        this.UnidadesValorativas = UnidadesValorativas;
    }
    public void PedirNotas(Scanner teclado) {
        System.out.println("Ingrese Nota del Acumulativo Primer Parcial:");
        this.NA1 = teclado.nextInt();
        System.out.println("Ingrese Nota del Examen Primer Parcial:");
        this.NE1 = teclado.nextInt();
        System.out.println("Ingrese Nota del Acumulativo Segundo Parcial:");
        this.NA2 = teclado.nextInt();
        System.out.println("Ingrese Nota del Examen Segundo Parcial:");
        this.NE2 = teclado.nextInt();
        System.out.println("Ingrese Nota del Acumulativo Tercer Parcial:");
        this.NA3 = teclado.nextInt();
        System.out.println("Ingrese Nota del Examen Tercer Parcial:");
        this.NE3 = teclado.nextInt();
        System.out.println("Ingrese Nota de Reposicion:");
        this.NR = teclado.nextInt();
    }
@Override
    public String toString() {
        return super.toString().concat("\n Nombre de la clase: ".concat(String.valueOf(this.getNombre())).concat("\n Unidades Valorativas: ").concat(String.valueOf(this.getUnidadesValorativas())).concat(" \n Notas del Primer Parcial:").concat(" \n -Acumulativo primer Parcial: ").concat(String.valueOf(this.getNA1())).concat("\n - Nota de Examen Primer Parcial: ").concat(String.valueOf(this.getNE1())).concat("").concat(
                        " \n Notas del Segundo Parcial: ").concat("\n -Acumulativo Segundo Parcial: ").concat(String.valueOf(this.getNA2())).concat("  \n -Nota Examen Segundo Parcial: ").concat(String.valueOf(this.getNE2())).concat("").concat(
                        " \n Notas del Tercer Parcial: ").concat(" \n -Acumulativo Tercer Parcial: ").concat(String.valueOf(this.getNA3())).concat(" \n -Nota Examen Tercer Parcial: ").concat(String.valueOf(this.getNE3())).concat(" \n Nota de Reposicion:").concat(String.valueOf(this.getNR())));
    }
    public String toStringLineal() {
        return "";
    }


























}
