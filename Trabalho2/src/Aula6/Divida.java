/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Aula6;

/**
 *
 * @author Heloise
 */

/**
* @version 2
*
*
*/
public class Divida {

    Integer id;
    Double valor;

    /**
     * @serial Número gerado automaticamente
     *
     *
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return double - retorno um valor do tipo double *
     */
    public double calcularDesconto(double taxa) {
        return valor * taxa / 100;
    }

    public double calcularValorLiquido(double taxa) {
        return valor - calcularDesconto(taxa);
    }
}
