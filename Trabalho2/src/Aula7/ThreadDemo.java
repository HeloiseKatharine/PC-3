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
public class ThreadDemo extends Thread {

    public ThreadDemo(String nome) {
        super(nome);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName());
        }
    }

    public static void main(String args[]) {
        ThreadDemo pnt1 = new ThreadDemo("A");
        ThreadDemo pnt2 = new ThreadDemo("B");
        ThreadDemo pnt3 = new ThreadDemo("C");
        ThreadDemo pnt4 = new ThreadDemo("D");

        pnt1.setPriority(Thread.MAX_PRIORITY);
    }
}
