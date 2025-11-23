package Ejercicio1_Alumno;

public class Alumno {
    private String nombre;
    private double nota;

    public Alumno() {

    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNota(double pNota) {
        this.nota = pNota;
    }

    public double getNota() {
        return this.nota;
    }

    public boolean esAprobado() {
        boolean aprobado;
        if (this.nota <= 4.99) {
            aprobado = false;
        } else {
            aprobado = true;
        }
        return aprobado;
    }

    public void mostarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nota: " + this.nota);
    }
}
