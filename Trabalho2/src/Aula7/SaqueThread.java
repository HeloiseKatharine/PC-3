/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;

/**
 *
 * @author heloh
 */
public class SaqueThread extends Thread {

    private ContaBancaria conta;
    private double quantia;
    private static final int REPETICOES = 10;
    private static final int ESPERA = 10;

    public SaqueThread(ContaBancaria conta, double quantia) {
        this.conta = conta;
        this.quantia = quantia;
    }

    public void run() {
        try {
            for (int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
                conta.saque(quantia);
                sleep(ESPERA);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
