package Ejercicio5_Empleado;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado() {

    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo (double pSueldo) {
        this.sueldo = pSueldo;
    }

    public void aplicarIncremento(double pPorcentaje) {
        pPorcentaje = pPorcentaje / 100;

        this.sueldo = this.sueldo + (this.sueldo * pPorcentaje);
        System.out.println("Su nuevo sueldo tras aumentarlo un: "+pPorcentaje+"% es: " + this.sueldo);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Sueldo: "+this.sueldo);
    }
}
