package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Rectangulo objRectangulo = new Rectangulo(26.3, 19.53);

        objRectangulo.calcularArea();

        objRectangulo.setAncho(-5);

        objRectangulo.calcularArea();
    }
}
