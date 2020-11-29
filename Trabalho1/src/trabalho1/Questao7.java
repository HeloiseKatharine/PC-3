/*
7. Faça um HashSet e insira as Strings “String 1”, “String 2” e “String 3” cada uma duas vezes, percorra todos os
elementos e imprima (System.out.println()). Observe o resultado. Quantos elementos têm a coleção?
 */
package trabalho1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Heloise
 */
public class Questao7 {
    public static void main(String[] args) {
        
    Set<String> lista = new HashSet<>();
    lista.add("String 1");
    lista.add("String 1");
    
    lista.add("String 2");
    lista.add("String 2");
    
    lista.add("String 3");
    lista.add("String 3");
    
    Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}