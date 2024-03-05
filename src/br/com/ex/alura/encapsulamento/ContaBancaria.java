package br.com.ex.alura.encapsulamento;

public class ContaBancaria {
    private int numeroCOnta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroCOnta;
    }

    public void setNumeroConta(int numeroCOnta) {
        this.numeroCOnta = numeroCOnta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
