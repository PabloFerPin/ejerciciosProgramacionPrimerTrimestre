package Ejercicio10_CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        cuentaBancaria objCuenta = new cuentaBancaria("Pablo", 3000);

        objCuenta.depositar(300);
        objCuenta.mostarSaldo();

        objCuenta.retirar(3000);
        objCuenta.mostarSaldo();

        objCuenta.retirar(400);
        objCuenta.mostarSaldo();
    }
}
