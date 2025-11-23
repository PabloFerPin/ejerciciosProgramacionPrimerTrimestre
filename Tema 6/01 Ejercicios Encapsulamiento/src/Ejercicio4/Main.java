package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Producto objProducto = new Producto(342.26);

        double precioFinal = objProducto.getPrecioConIVA();

        System.out.println("El precio final es: " + precioFinal);
    }
}
