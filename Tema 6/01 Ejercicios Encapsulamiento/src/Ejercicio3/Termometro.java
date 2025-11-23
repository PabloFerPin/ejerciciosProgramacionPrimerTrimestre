package Ejercicio3;

public class Termometro {
    private double temperaturaCelsius;

    public Termometro () {

    }

    public Termometro (double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public void seTemperaturaCelsius(double pTemperaturaCelsius) {
        this.temperaturaCelsius = pTemperaturaCelsius;
    }

    public double getTemperaturaCelsius () {
        return this.temperaturaCelsius;
    }

    public void pasarFahrenheit () {
        double pResultado = (this.temperaturaCelsius*9/5)+32;

        System.out.println("La tempetura en grados Fahrenheit equivale a: "+pResultado);
    }
}
