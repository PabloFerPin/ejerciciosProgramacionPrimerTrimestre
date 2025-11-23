package Ejercicio3_Producto;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {

    }

    public Producto (String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double pPrecio) {
        this.precio = pPrecio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad (int pCantidad) {
        this.cantidad = pCantidad;
    }

    public void modificarPrecio(double pNuevoPrecio) {
        this.precio = pNuevoPrecio;
    }

    public void vender(int pCantidadVendida) {
        this.cantidad = this.cantidad - pCantidadVendida;
        if (this.cantidad < 0) {
            System.out.println("Stock insuficiente para la venta");
            this.cantidad = this.cantidad + pCantidadVendida;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
    }
}
