package Ejercicio7_Persona;

public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private int anioNacimiento;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int DNI, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.anioNacimiento = anioNacimiento;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public String getNombtre() {
        return this.nombre;
    }

    public void setApedillo(String pApellido) {
        this.apellido = pApellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setDNI(int pDNI) {
        this.DNI = pDNI;
    }

    public int getDNI() {
        return this.DNI;
    }

    public void setAnioNacimiento(int pAnioNacimiento) {
        this.anioNacimiento = pAnioNacimiento;
    }

    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Anio Nacimiento: " + this.anioNacimiento);
    }
}
