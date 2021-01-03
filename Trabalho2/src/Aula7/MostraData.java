/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;

import java.util.Date;

/**
 *
 * @author heloh
 */
public class MostraData extends Thread {

    private String mensagem;

    private static final int REPETICOES = 10;
    private static final int ESPERA = 1000;

    public MostraData(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= REPETICOES; i++) {
                Date agora = new Date();
                System.out.println(agora + " " + mensagem);
                sleep(ESPERA);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }

}
