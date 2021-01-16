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
public class ClasseExterna {

    private Integer numero;

    private class ClasseInterna {

        public void imprimir() {
            System.out.println("Dentro do método da inner class");
        }
    }

    public void mostrarInnerClass() {
        ClasseInterna ci = new ClasseInterna();
        ci.imprimir();
    }
    
}
