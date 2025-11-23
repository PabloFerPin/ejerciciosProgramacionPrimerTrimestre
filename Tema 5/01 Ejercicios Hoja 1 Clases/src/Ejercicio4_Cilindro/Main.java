package Ejercicio4_Cilindro;

public class Main {
    public static void main(String[] args) {
        Cilindro objCilindro1 = new Cilindro(8,31);
        Cilindro objCilindro2 = new Cilindro(12.92, 20);

        objCilindro1.mostrarMedidas();
        System.out.println("El volumen del cilindro es: "+objCilindro1.calcularVolumen());
        System.out.println("El area lateral del cilindro es: "+objCilindro1.calcularAreaLateral());
    }
}
