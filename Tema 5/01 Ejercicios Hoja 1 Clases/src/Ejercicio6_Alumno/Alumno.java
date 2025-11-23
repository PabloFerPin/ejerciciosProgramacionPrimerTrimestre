package Ejercicio6_Alumno;

public class Alumno {
    private String nombre;
    private String nombreAsignatura;
    private double notaParcial1Examen;
    private double notaParcial2Examen;
    private double notaExposicion;
    private double notaEjercicios;
    private double notaTrabajoClase;

    public Alumno() {

    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombreAsignatura(String pNombreAsignatura) {
        this.nombreAsignatura = pNombreAsignatura;
    }

    public String getNombreAsignatura() {
        return this.nombreAsignatura;
    }

    public void setNotaParcial1Examen(double pNotaParcial1) {
        this.notaParcial1Examen = pNotaParcial1;
    }

    public double getNotaParcial1Examen() {
        return this.notaParcial1Examen;
    }

    public void setNotaParcial2Examen(double pNotaParcial2) {
        this.notaParcial2Examen = pNotaParcial2;
    }

    public double getNotaParcial2Examen() {
        return this.notaParcial2Examen;
    }

    public void setNotaExposicion(double pNotaExposicion) {
        this.notaExposicion = pNotaExposicion;
    }

    public double getNotaExposicion() {
        return this.notaExposicion;
    }

    public void setNotaEjercicios(double pNotaEjercicios) {
        this.notaEjercicios = pNotaEjercicios;
    }

    public double getNotaEjercicios() {
        return this.notaEjercicios;
    }

    public void setNotaTrabajoClase(double pNotaTrabajoClase) {
        this.notaTrabajoClase = pNotaTrabajoClase;
    }

    public double getNotaTrabajoClase() {
        return this.notaTrabajoClase;
    }

    public void insertarRegistro(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajoClase = notaTrabajoClase;
    }

    public void modificarRegistro(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajoClase = notaTrabajoClase;
    }

    public void eliminarRegistro() {
        this.nombre = null;
        this.nombreAsignatura = null;
        this.notaParcial1Examen = 0;
        this.notaParcial2Examen = 0;
        this.notaExposicion = 0;
        this.notaEjercicios = 0;
        this.notaTrabajoClase = 0;
    }

    public double calcularNotaPrimeraEvaluacion() {
        double pNotaMedia = this.notaParcial1Examen * 0.25 + this.notaParcial2Examen * 0.25 + this.notaExposicion * 0.1 + this.notaEjercicios * 0.25 + this.notaTrabajoClase * 0.15;
        return pNotaMedia;
    }
}