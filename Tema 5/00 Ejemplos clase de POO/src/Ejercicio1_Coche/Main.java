package Ejercicio1_Coche;

public class Main {
    public static void main(String[] args) {
        Coche objCoche1 = new Coche("A4", 250, "B");
        objCoche1.setMarca("Audi");
        objCoche1.mostrarInformacion();

        boolean bResultado = objCoche1.comprobarZBE(objCoche1.getEtiquetaEcologica());
        System.out.println("Cumple el coche con la ZBE: " + bResultado);
        int verResultadoVelocidad = objCoche1.sonbrepasarVelocidadMaxima(objCoche1.getVelocidadMaxima());
        System.out.println("Velocidad maxima superada en: " + verResultadoVelocidad + " km/h");

        Coche objtCoche2 = new Coche("Dacia", "Sandero", 110, "Eco");
        objtCoche2.mostrarInformacion();

        boolean bResultado2 = objtCoche2.comprobarZBE(objtCoche2.getEtiquetaEcologica());
        int verResultadoVelocidad2 = objtCoche2.sonbrepasarVelocidadMaxima(objtCoche2.getVelocidadMaxima());
        System.out.println("Cumple el coche con la ZBE: " + bResultado2);
        System.out.println("Velocidad maxima superada en: " + verResultadoVelocidad2 + " km/h");

        objCoche1.ejemploSinStatic();
        Coche.ejemploConEstatic();
    }
}