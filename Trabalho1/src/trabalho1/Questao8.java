/*
8. Faça um HashMap e insira as Strings “String 1”, “String 2” e “String 3” cada uma duas vezes, utilize o
numeral como chave, percorra todos os elementos e imprima (System.out.println()). Observe o resultado.
 */
package trabalho1;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Heloise
 */
public class Questao8 {
    public static void main(String[] args) {
        
        Map<Integer, String> map1 = new Hashtable<Integer, String>();
        
        //Adcionando elementos 
        
        map1.put( 0, "String 1" );
        map1.put( 1, "String 1" );
        
        map1.put( 2, "String 2" );
        map1.put( 3, "String 2" );
        
        map1.put( 4, "String 3" );
        map1.put( 5, "String 3" );        
        
        for(Integer key : map1.keySet()) {
            String value = map1.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
