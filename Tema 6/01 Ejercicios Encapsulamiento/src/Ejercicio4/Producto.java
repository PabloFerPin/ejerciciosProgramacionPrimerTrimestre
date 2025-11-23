package Ejercicio4;

public class Producto {
    private double precio;

    public Producto () {

    }

    public Producto (double precio) {
        this.precio = precio;
    }

    public void setPrecio (double pPrecio) {
        this.precio = pPrecio;
    }

    public double getPrecio () {
        return this.precio;
    }

    public double getPrecioConIVA() {
        double pResultado = this.precio+this.precio*0.21;
        return pResultado;
    }
}
