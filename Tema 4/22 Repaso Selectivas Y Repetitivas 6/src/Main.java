import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        String password = "DAM2025";
        boolean continuar = true;
        int iteraciones = 0;

        while (continuar) {
            System.out.println("Introduce su contraseña");
            String passwordU = date.nextLine();

            if (passwordU.equals(password)) {
                System.out.println("Contraseña correcta");
                continuar = false;
            } else {
                iteraciones++;
            }

            if (iteraciones >= 3) {
                System.out.println("Intentos agotados");
                continuar = false;
            }
        }
    }
}
