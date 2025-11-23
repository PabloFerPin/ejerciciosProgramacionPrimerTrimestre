package Ejercicio2_Semaforo;

public class Semaforo {
    private String color;

    public Semaforo() {

    }

    public Semaforo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String cambiarColor(String pColor) {
        String fResultado;

        switch (pColor) {
            case "A":
                fResultado = "V";
                break;
            case "V":
                fResultado = "R";
                break;
            case  "R":
                fResultado = "A";
                break;
            default:
                fResultado = "Erroneo";
                break;
        }

        this.color = fResultado;
        return fResultado;
    }
}
