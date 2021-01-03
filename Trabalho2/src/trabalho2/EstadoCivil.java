/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Heloise
 */
public enum EstadoCivil {
    SOLTEIRO(1), CASADO(2), DIVORCIADO(3), VIUVO(4), OUTRO(5);

    private int valor;

    private EstadoCivil(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
