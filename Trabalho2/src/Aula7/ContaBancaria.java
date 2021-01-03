package Aula7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Heloise
 */
public class ContaBancaria {

    private Double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void deposito(double quantia) {
        System.out.print("depositando " + quantia);
        double novoSaldo = saldo + quantia;
        System.out.println(", novo saldo é " + novoSaldo);
        saldo = novoSaldo;
        notifyAll();
    }

    public synchronized void saque(double quantia) throws InterruptedException {
        while (saldo < quantia) {
            wait();
        }
        System.out.print("sacando " + quantia);
        double novoSaldo = saldo - quantia;
        System.out.println(", novo saldo é " + novoSaldo);
        saldo = novoSaldo;
    }
}
