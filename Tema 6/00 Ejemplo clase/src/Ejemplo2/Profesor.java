package Ejemplo2;

public class Profesor {
    private int id;
    private String nombre;

    public Profesor() {

    }

    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Id: "+this.id);
    }
}
