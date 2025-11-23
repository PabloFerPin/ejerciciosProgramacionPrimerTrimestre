package Ejercicio8_Rectangulo;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        double area = this.base * this.altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = this.base * 2 + this.altura * 2;
        return perimetro;
    }

    public void mostrarDimensiones() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }
}
