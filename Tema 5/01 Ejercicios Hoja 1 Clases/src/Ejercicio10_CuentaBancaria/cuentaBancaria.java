package Ejercicio10_CuentaBancaria;

public class cuentaBancaria {
    private String titular;
    private double saldo;

    public cuentaBancaria() {

    }

    public cuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String pTitular) {
        this.titular = pTitular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double pSaldo) {
        this.saldo = pSaldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double pCantidadD) {
        this.saldo = this.saldo + pCantidadD;
    }

    public void retirar(double pCantidadR) {
        if ((this.saldo - pCantidadR) > 0) {
            this.saldo = this.saldo - pCantidadR;
        } else {
            System.out.println("Saldo insuficiente para retirar la cantidad introducida");
        }
    }

    public void mostarSaldo() {
        System.out.println("Su saldo actual es: " + this.saldo + " €");
    }
}
