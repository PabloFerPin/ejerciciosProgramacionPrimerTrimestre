package Ejercicio11_Automovil;

public class Automovil {
    private String marca;
    private int modelo;
    private double motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private double velocidadActual;

    public Automovil() {

    }

    public Automovil(String marca, int modelo, double motor, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String pMarca) {
        this.marca = pMarca;
    }

    public double getMotor() {
        return this.motor;
    }

    public void setMotor(double pMotor) {
        this.motor = pMotor;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(int pNumeroPuertas) {
        this.numeroPuertas = pNumeroPuertas;
    }

    public int getCantidadAsientos() {
        return this.cantidadAsientos;
    }

    public void setCantidadAsientos(int pCantidadAsientos) {
        this.cantidadAsientos = pCantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int pVelocidadMaxima) {
        this.velocidadMaxima = pVelocidadMaxima;
    }

    public double getVelocdidadActual() {
        return this.velocidadActual;
    }

    public void setVelocdidadActual(int pVelocdidadActual) {
        this.velocidadActual = pVelocdidadActual;
    }

    public void acelerar(double pVelocidad) {
        if (this.velocidadActual + pVelocidad > velocidadMaxima) {
            System.out.println("No se puede rebasar la velocidad maxima");
        } else {
            this.velocidadActual = this.velocidadActual + pVelocidad;
        }
    }

    public void desacelerar(double pVelocidad) {
        if (this.velocidadActual - pVelocidad < 0) {
            System.out.println("No se desacelerar hasta alcanzar una velocidad negativa");
        } else {
            this.velocidadActual = this.velocidadActual - pVelocidad;
        }
    }

    public void frenar() {
        this.velocidadActual = 0;
    }

    public void calcularTiempoEstimado (double pDistancia) {
        double pTiempoEstimado = pDistancia / this.velocidadActual;
        System.out.println("El tiempo estimado es: " + pTiempoEstimado);
    }

    public void mostrarInfo () {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motor: " + this.motor);
        System.out.println("Numero Puertas: " + this.numeroPuertas);
        System.out.println("Cantidad Asientos: " + this.cantidadAsientos);
        System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
        System.out.println("Velocidad Actual: " + this.velocidadActual);
    }
}
