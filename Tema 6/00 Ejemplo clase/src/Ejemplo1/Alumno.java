package Ejemplo1;

public class Alumno {
    private int id;
    private String nombre;
    public int edad;

    public Alumno() {

    }

    public Alumno(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        if (edad > 100 || edad < 0) {
            System.out.println("Edad no valida");
        } else {
            this.edad = edad;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int pEdad) {
        if (pEdad > 100 || pEdad < 0) {
            System.out.println("Edad no valida");
        } else {
            this.edad = pEdad;
        }
    }

    public void mostarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Id: " + this.id);
        System.out.println("Edad: " + this.edad);
    }

//    public void prueba () {
//        mostarInfo();
//    }
}

