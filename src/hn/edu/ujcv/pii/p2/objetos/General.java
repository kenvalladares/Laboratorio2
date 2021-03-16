package hn.edu.ujcv.pii.p2.objetos;

import hn.edu.ujcv.pii.p2.objetos.Clase;

public class General extends Clase {
    private boolean TodasCarreras;

    public General(){
    }
    public General(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas, int NA1, int NE1, int NA2, int NE2, int NA3, int NE3, int NR) {
        super(Id, Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2, NA3, NE3, NR);
    }

    public boolean getTodasCarreras() {
        return TodasCarreras;
    }

    public void setTodasCarreras(boolean todasCarreras) {
        TodasCarreras = todasCarreras;
    }
    @Override
    public String toString() {
        return super.toString().concat("\n Nombre de la clase : ".concat(String.valueOf(this.getNombre())).concat(" \n Unidades Valorativas de la clase").concat(String.valueOf(this.getUnidadesValorativas())).concat(
                " \n Notas del primer Parcial: ").concat("   - Acumulativo Primer Parcial: ").concat(String.valueOf(this.getNA1())).concat("  - Nota de Examen primer parcial").concat(String.valueOf(this.getNE1())).concat(" ").concat(
                "\n Notas del Segundo Parcial: ").concat("   - Acumulativo Segundo Parcial:").concat(String.valueOf(this.getNA2())).concat("  - Nota Examen Segundo Parcial").concat(String.valueOf(this.getNE2())).concat(" ").concat(
                "\n Notas del Tercer Parcial :").concat("  - Acumulativo Tercer Parcial :").concat(String.valueOf(this.getNA3())).concat("  - Nota Examen Tercer Parcial: ").concat(String.valueOf(this.getNE3())).concat("  - Nota de Reposicion: ").concat(String.valueOf(this.getNR())));
    }
    public double CalcularNotaFinal() {
        return (double)(this.getNA1() + this.getNA2() + this.getNA3() + this.getNE1() + this.getNE2() + this.getNE3() + this.getNR());
    }
    public String toStringLineal() {
        return "Nombre de la clase: " + this.getNombre() + "\nCodigo: " + this.getId()  + "\nUnidades Valorativas: " + this.getUnidadesValorativas() + "\n";
    }
}


