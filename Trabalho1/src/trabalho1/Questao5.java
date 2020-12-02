package trabalho1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
5. Utilizando a classe Collections ordene a coleção criada no exercício 2. Imprima (System.out.println()) o resultado.
 */

/**
 *
 * @author Heloise 
 */
public class Questao5 {
     public static void main(String[] args) {
     
        List lista = new ArrayList();
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        System.out.println("Lista: ");
        /*for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("Lista Ordenada: ");
        Collections.sort(lista);
        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }*/
    }
}

