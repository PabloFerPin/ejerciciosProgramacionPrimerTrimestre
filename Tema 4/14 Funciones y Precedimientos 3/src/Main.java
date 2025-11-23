import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Dame la base y la ultura de tu triangulo para calcular la base");
        double base = datos.nextDouble();
        double altura = datos.nextDouble();

        double resultado = calcArea(base, altura);
        System.out.println("Su area mide: " + resultado);
    }

    public static double calcArea(double fBase, double fAltura){
        double area = (fBase * fAltura)/2;
        return area;
    }
}