package Ejercicio1_Coche;

public class Coche {
    //atributos
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private String etiquetaEcologica;

    //contructures, 1 vacio, otro con las 4 variables y otro con solo 3 variable. Se llama sobrecarga
    public Coche() {

    }

    public Coche(String marca, String modelo, int velocidadMaxima, String etiquetaEcologica) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.etiquetaEcologica = etiquetaEcologica;
    }

    public Coche(String modelo, int velocidadMaxima, String etiquetaEcologica) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.etiquetaEcologica = etiquetaEcologica;
    }

    //getters y setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String pMarca) {
        this.marca = pMarca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String pModelo) {
        this.modelo = pModelo;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int pVelocidadMaxima) {
        this.velocidadMaxima = pVelocidadMaxima;
    }

    public String getEtiquetaEcologica() {
        return this.etiquetaEcologica;
    }

    public void setEtiquetaEcologica(String pEtiquetaEcologica) {
        this.etiquetaEcologica = pEtiquetaEcologica;
    }

    //procedimiento para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Etiqueta de coche: " + this.etiquetaEcologica);
    }

    //comprobar si entra en la zona de bajas emisiones
    public boolean comprobarZBE(String pEtiquetaEcologica) {
        boolean pResultado;

        if (pEtiquetaEcologica.equals("0") || pEtiquetaEcologica.equals("Eco")) {
            pResultado = true;
        } else {
            pResultado = false;
        }

        return pResultado;
    }

    //comprobar si pasa la velocidad maxima y da la diferencia
    public int sonbrepasarVelocidadMaxima(int pVelocidadMaxima) {
        int velocidadRecomendada = 120;
        int pResultado = pVelocidadMaxima - velocidadRecomendada;
        return pResultado;
    }

    //ejemplo
    public void ejemploSinStatic() {
        System.out.println("Resultado sin estatic");
    }

    public static void ejemploConEstatic() {
        System.out.println("Resultado con estatic");
    }
}