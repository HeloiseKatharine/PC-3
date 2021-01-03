/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

import java.util.ArrayList;

/**
 *
 * @author Heloise
 */
public class CalculaValor {

    /*O primeiro método de deverá receber o tipo de serviço e a
    quantidade de serviços desse tipo e devolver o valor total desse tipo.*/
    public static double calculaValor(int quant, Oficina tipo) {
        switch (tipo) {
            case CARGADECARTUCHO:
                return quant * Oficina.CARGADECARTUCHO.getValor();
            case CONSERTODECARREGADOR:
                return quant * Oficina.CONSERTODECARREGADOR.getValor();
            case CONSERTODECOMPUTADORES:
                return quant * Oficina.CONSERTODECOMPUTADORES.getValor();
            case CONSERTODEIMPRESSORA:
                return quant * Oficina.CONSERTODEIMPRESSORA.getValor();
            case TROCADEBATERIA:
                return quant * Oficina.TROCADEBATERIA.getValor();
            default:
                return 0.0;
        }
    }

    /*O segundo método deverá receber uma lista com o tipo de serviço e quantidade
executada desse serviço, chamar o primeiro e passar cada serviço da lista,
receber o resultado e ir acumulando os valores. Quando encerrar o cálculo, o
método deverá devolver o valor total dos serviços.*/

    public static double calculaValorTotal(ArrayList<Oficina> lista, int quant) {
        double soma = 0.0;

        for (int i = 0; i < lista.size(); i++) {
            soma = soma + calculaValor(quant, (Oficina) lista.get(i));
        }
        return soma;
    }
}
