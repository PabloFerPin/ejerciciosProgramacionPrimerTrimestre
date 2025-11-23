import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        String pin = "1234";
        double saldo = 1000;
        double ingreso = 0;
        double retirada = 0;

        boolean bucleM = true;
        boolean bucleS = true;

        int contador = 0;
        int numero = 0;

        while (bucleM) {
            System.out.println("Intruce tu pin");
            String pinUsuario = datos.nextLine();

            if (pinUsuario.equals(pin)) {
                System.out.println("Pin correcto");

                while (bucleS) {
                    System.out.println("1 --> Consultar saldo");
                    System.out.println("2 --> Ingresar dinero");
                    System.out.println("3 --> Retirar dinero");
                    System.out.println("4 --> Salir");
                    numero = datos.nextInt();

                    switch (numero) {
                        case 1:
                            System.out.println(saldo);
                            break;
                        case 2:
                            System.out.println("¿Cuanto dinero desea ingresar?");
                            ingreso = datos.nextDouble();
                            saldo = saldo + ingreso;
                            break;
                        case 3:
                            System.out.println("¿Cuanto dinero desea retirar?");
                            retirada = datos.nextDouble();
                            saldo = saldo - retirada;
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            bucleS = false;
                            bucleM = false;
                            break;
                        default:
                            System.out.println("Valor no valido");
                            break;
                    }
                }
            } else {
                System.out.println("Pin incorrecto");
                contador++;
            }

            if (contador == 3) {
                System.out.println("Intentos agotados");
                bucleM = false;
            }
        }
    }
}