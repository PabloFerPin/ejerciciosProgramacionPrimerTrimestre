package Ejericicio3_Cafetera;

public class Cafetera {
    private double capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {

    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(double pCapacidadMaxima) {
        this.capacidadMaxima = pCapacidadMaxima;
    }

    public double getCpacidadActual() {
        return this.capacidadActual;
    }

    public void setCapacidadActual(double pCapacidadActual) {
        this.capacidadActual = pCapacidadActual;
    }

    public void servirCafetera(double fCantidad) {

        if (fCantidad > this.capacidadActual) {
            System.out.println("No puedes servir mas capacidad de la que tiene la cafetera");
        } else {
            this.capacidadActual = this.capacidadActual - fCantidad;
            System.out.println(this.capacidadActual);
        }
    }

    public void rellenarCafetera(double fCantidad) {
        double sumaCapacidad = this.capacidadActual + fCantidad;

        if (sumaCapacidad > this.capacidadMaxima) {
            System.out.println("No puedes superar la capacidad maxima de la cafetera");
        } else {
            this.capacidadActual = sumaCapacidad;
            System.out.println("Tras rellenar la cafetera con: "+fCantidad+" ml ahora su capacidad actual es de: " + this.capacidadActual + " ml");
        }
    }
}
