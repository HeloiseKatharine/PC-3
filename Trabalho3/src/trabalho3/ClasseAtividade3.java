/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3;

/**
 *
 * @author Heloise
 */
public class ClasseAtividade3 {

    public void metodoComInnerClass() {
        int numero = 123;

        class ClasseInternaComoVariavelLocal {

            public void imprimir() {
                System.out.println(
                        "Método da inner class exibindo o valor da variáve local: " + numero);
            }
        }

        ClasseInternaComoVariavelLocal civl = new ClasseInternaComoVariavelLocal();
        civl.imprimir();
    }
}
