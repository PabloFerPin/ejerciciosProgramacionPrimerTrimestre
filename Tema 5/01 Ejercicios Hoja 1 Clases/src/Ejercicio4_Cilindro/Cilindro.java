package Ejercicio4_Cilindro;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro() {

    }

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double pRadio) {
        this.radio = pRadio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }

    public double calcularVolumen() {
        double pResultadoV = Math.PI * Math.pow(this.radio, 2) * this.altura;
        System.out.println(pResultadoV);
        return pResultadoV;
    }

    public double calcularAreaLateral() {
        double pResultadoAL = 2 * Math.PI * this.radio * this.altura;
        return  pResultadoAL;
    }

    public void mostrarMedidas() {
        System.out.println("Radio: " + this.radio);
        System.out.println("Altura: " + this.altura);
    }
}
