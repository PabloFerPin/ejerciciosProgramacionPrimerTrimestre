import java.util.Scanner;

public class Main {
    public static void procedimiento(String otraVariable){
        System.out.println(otraVariable);
    }

    public static int funcion(int varDevuelto){
        int resultado = varDevuelto+5;
        return resultado;
    }

    public static void main(String[] args) {
        String variable = "Paso de variable";
        procedimiento(variable);

        int devuelto = 5;
        int valor = funcion(devuelto);
        System.out.println(valor);
    }
}
