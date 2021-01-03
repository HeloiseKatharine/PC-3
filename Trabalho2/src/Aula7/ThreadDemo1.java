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
public class ThreadDemo1 implements Runnable {

    Thread thread;

    public ThreadDemo1(String nome) {
        thread = new Thread(this, nome);
        thread.start();
    }

    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }

    public static void main(String args[]) {
        new ThreadDemo1("A");
        new ThreadDemo1("B");
        new ThreadDemo1("C");
        new ThreadDemo1("D");
    }
}
