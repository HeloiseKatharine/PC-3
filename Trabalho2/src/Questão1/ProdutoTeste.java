/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author Heloise
 */
public class ProdutoTeste {

    public static void main(String[] args) {
        Produto produto = new Produto();
        Compra compra = new Compra(produto, 100);
        Venda venda = new Venda(produto, 50);
        Compra compra2 = new Compra(produto, 100);
        Venda venda2 = new Venda(produto, 100);
       
        compra.run();
        venda.run();
        compra2.run();
        venda2.run();
    }
}
