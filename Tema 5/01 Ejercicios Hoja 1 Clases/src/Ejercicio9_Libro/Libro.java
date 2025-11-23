package Ejercicio9_Libro;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro() {

    }

    public Libro(String titulo, String autor, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String pTitulo) {
        this.titulo = pTitulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String pAutor) {
        this.autor = pAutor;
    }

    public boolean getPrestado() {
        return this.prestado;
    }

    public void setPrestado(boolean pPrestado) {
        this.prestado = pPrestado;
    }

    public void prestar() {
        if (this.prestado == true) {
            System.out.println("Libro prestado");
        } else {
            this.prestado = true;
            System.out.println("Prestamo realizado correctamente");
        }
    }

    public void devolver() {
        if (this.prestado == true) {
            System.out.println("Devolucion realizada correctamente");
            this.prestado = false;
        } else {
            System.out.println("No puedes devolver un libro que no esta prestado");
        }
    }

    public void estado() {
        if (this.prestado == true) {
            System.out.println("El libro esta prestado");
        } else {
            System.out.println("El libro no esta prestado");
        }
    }
}
