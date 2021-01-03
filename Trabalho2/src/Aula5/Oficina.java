/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author Heloise
 */
public enum Oficina {
    
    CARGADECARTUCHO("Carga de cartucho", 25.00),
    CONSERTODEIMPRESSORA("Conserto de impressora", 100.00),
    CONSERTODECOMPUTADORES("Conserto de computadores", 150.00),
    TROCADEBATERIA("Troca de bateria", 100.00),
    CONSERTODECARREGADOR("Conserto de carregador", 75.00);

    private String descricao;
    private double valor;

    private Oficina(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    
}
