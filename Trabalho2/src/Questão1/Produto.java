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
public class Produto {

    private Double valor;

    public Produto() {
        valor = 0.0;
    }

    public double getSaldo() {
        return valor;
    }

    public synchronized void compra(double quantia) {
        System.out.print("Abastecendo o estoque " + quantia);
        double novoSaldo = valor + quantia;
        System.out.println("Total de produtor no estoque: " + novoSaldo);
        valor = novoSaldo;
        notifyAll();
    }

    public synchronized void venda(double quantia) throws InterruptedException {
        while (valor < quantia) {
            wait();
        }
        System.out.print("Vendend:o " + quantia);
        double novoSaldo = valor - quantia;
        System.out.println("Novo total de produtos no estoque: " + novoSaldo);
        valor = novoSaldo;
    }
}
