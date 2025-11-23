package Ejercicio5;

public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo() {

    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double pAlto) {
        if (pAlto < 0) {
            System.out.println("Valor de alto no valido");
        } else {
            this.alto = pAlto;
        }
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double pAncho) {
        if (pAncho < 0) {
            System.out.println("Valor de ancho no valido");
        } else {
            this.ancho = pAncho;
        }
    }

    public void calcularArea() {
        double pResultado = this.alto * this.ancho;
        System.out.println("El area del rectangulo es igual a: " + pResultado);
    }
}
