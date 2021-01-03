/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author Heloise
 */
public class Venda extends Thread {

    private Produto produto;
    private double quantia;
    private static final int REPETICOES = 10;
    private static final int ESPERA = 10;

    public Venda(Produto produto, double quantia) {
        this.produto = produto;
        this.quantia = quantia;
    }

    public void run() {
        try {
            for (int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
                produto.venda(quantia);
                sleep(ESPERA);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
