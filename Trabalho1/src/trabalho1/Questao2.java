/*
2. Faça um ArrayList e insira as Strings “String 1”, “String 2” e “String 3” cada uma duas vezes, percorra todos 
os elementos e imprima (System.out.println()). Observe o resultado. Quantos elementos têm a coleção?
 */
package trabalho1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Heloise
 */
public class Questao2 {
 
    public static void main(String[] args) {
     
        List lista = new ArrayList();
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");
        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
