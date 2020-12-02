/*
3. Utilizando a classe Collections desordene a coleção criada no exercício 2. Imprima (System.out.println()) o resultado.
 */
package trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class Questao3 {
    public static void main(String[] args) {
       
        List lista = new ArrayList();
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        System.out.println("Lista ordenada");
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        /*Lista não ordenada*/
        //Collections.shuffle(lista);
        
        /*Collections.reverse(lista);*/
        Collections.shuffle(lista);
        
        System.out.println("Lista invertida");
         for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
