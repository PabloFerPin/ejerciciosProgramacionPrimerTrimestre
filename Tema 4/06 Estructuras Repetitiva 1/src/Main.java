public class Main {
    public static void main (String[] args){
        int precio = 5;

        for (int x=1; x<=12; x++) {
            precio=precio*2;
            System.out.println(precio);
        }

        precio=precio-5;

        System.out.println(precio);
    }
}
