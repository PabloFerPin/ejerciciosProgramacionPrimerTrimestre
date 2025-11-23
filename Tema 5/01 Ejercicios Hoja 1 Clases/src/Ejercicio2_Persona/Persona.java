package Ejercicio2_Persona;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    public boolean esMayorDeEdad() {
        boolean esMayorDeEdad;
        if (this.edad > 18) {
            esMayorDeEdad = true;
        } else {
            esMayorDeEdad = false;
        }
        return esMayorDeEdad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
