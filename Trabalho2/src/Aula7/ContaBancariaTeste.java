/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;

/**
 *
 * @author Heloise
 */
public class ContaBancariaTeste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        DepositoThread t0 = new DepositoThread(conta, 100);
        SaqueThread t1 = new SaqueThread(conta, 100);
        DepositoThread t2 = new DepositoThread(conta, 100);
        SaqueThread t3 = new SaqueThread(conta, 100);
        /*t0.start();
        t1.start();
        t2.start();
        t3.start();*/
        t0.run();
        t1.run();
        t2.run();
        t3.run();
    }
}
