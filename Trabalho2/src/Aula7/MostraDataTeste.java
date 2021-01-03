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
public class MostraDataTeste {

    public static void main(String[] args) {
        /*  MostraData md1 = new MostraData("Olá");
        MostraData md2 = new MostraData("Adeus");
        //md1.start();
        //md2.start();
        md1.run();
        md2.run();*/

        MostraData md1 = new MostraData("Olá");
        MostraData md2 = new MostraData("Adeus");
        md2.setPriority(Thread.MAX_PRIORITY);//Linha acrescentada
        md1.start();
        md2.start();
    }
}
