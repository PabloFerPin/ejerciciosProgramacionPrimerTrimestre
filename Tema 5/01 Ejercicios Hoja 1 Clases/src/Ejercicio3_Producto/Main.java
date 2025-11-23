package Ejercicio3_Producto;

public class Main {
    public static void main(String[] args) {
        Producto objProducto1 = new Producto("Cortina blanca", 23.82, 34);
        Producto objProducto2 = new Producto("Silla azul", 235.82, 7);

        objProducto1.modificarPrecio(52.19);
        objProducto1.mostrarInfo();
        objProducto1.vender(38);
    }
}
