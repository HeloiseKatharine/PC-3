/*
16. Crie um HashSet e adicione 5 (cinco) ContaCorrente diferentes. Imprima o resultado (System.out.println()).
 */
package trabalho1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Heloise
 */
public class Questao16 {
    public static void main(String[] args) {
        
        Set<String> contas = new HashSet<>();
        
        contas.add("321876");
        contas.add("654545");
        contas.add("354545");
        contas.add("655445");
        contas.add("358795");
        
        System.out.println(contas);
        
       /* Iterator<String> it = contas.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        
    }
}
