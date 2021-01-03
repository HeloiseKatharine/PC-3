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
public enum Taxa {
    IPTU("Imposto Predial, Territorial e Urbano", 0.005),
    IPVA("Imposto sobre Propriedade de Veículos Automotores", 0.035),
    ITBI("Imposto sobre Transferência de Bens Imóveis", 0.02),
    ISSQN("Imposto Sobre Serviço de Qualquer Natureza", 0.1);

    private String descricao;
    private double percentual;

    private Taxa(String descricao, double percentual) {
        this.descricao = descricao;
        this.percentual = percentual;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPercentual() {
        return percentual;
    }
    
    
}
