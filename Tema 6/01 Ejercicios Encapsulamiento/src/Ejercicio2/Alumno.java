package Ejercicio2;

public class Alumno {
    private int nota;

    public Alumno () {

    }

    public Alumno(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota (int pNota) {
        if (pNota < 0 || pNota > 10) {
            System.out.println("Nota no valida");
        } else {
            this.nota = pNota;
        }
    }
}
