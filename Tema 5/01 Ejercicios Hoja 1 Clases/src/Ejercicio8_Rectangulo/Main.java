package Ejercicio8_Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(27.92, 9.83);

        rectangulo.mostrarDimensiones();

        double area = rectangulo.calcularArea();
        double perimetro = rectangulo.calcularPerimetro();
        System.out.println("El area del perimetro es: " + area);
        System.out.println("El area del perimetro es: " + perimetro);
    }
}
