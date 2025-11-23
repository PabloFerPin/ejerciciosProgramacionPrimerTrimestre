import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String contraseñaUsuario = myObj.nextLine();

        String n = contraseñaUsuario;
        String contraseñaADM = "admin123";

        if (n.equals(contraseñaADM)) {
            System.out.println("Acceso permitido");
        }
        else {
            System.out.println("Acceso denegado");
        }
    }
}
