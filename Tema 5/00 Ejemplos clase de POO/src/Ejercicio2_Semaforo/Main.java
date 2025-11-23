package Ejercicio2_Semaforo;

public class Main {
    public static void main(String[] args) {
        Semaforo objSemaforo1 = new Semaforo();
        objSemaforo1.setColor("R");
        System.out.println(objSemaforo1.getColor());

        String resultado = objSemaforo1.cambiarColor(objSemaforo1.getColor());
        System.out.println(resultado);

        System.out.println(objSemaforo1.getColor());
    }
}
