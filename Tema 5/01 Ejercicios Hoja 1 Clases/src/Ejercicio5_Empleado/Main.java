package Ejercicio5_Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado objEmpleado1 = new Empleado("Juan", 200);

        objEmpleado1.mostrarDatos();
        objEmpleado1.aplicarIncremento(20);
        objEmpleado1.mostrarDatos();
    }
}
