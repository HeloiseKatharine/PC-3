package questoes;

/*
3) Escreva um programa para criar um HashMap de String, use um Integer com chave.
Adicione 20 elementos aleatórios no HashMap. Liste as chaves e os valores do HashMap.
  */

/**
 *
 * @author Heloise
 */

import java.util.HashMap;
import java.util.Map;

public class Questao3 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        
        map1.put( 0, "String 1" );
        map1.put( 1, "String 2" );
        map1.put( 2, "String 3" );
        map1.put( 3, "String 4" );
        map1.put( 4, "String 5" );
        map1.put( 5, "String 6" );
        map1.put( 6, "String 7" );
        map1.put( 7, "String 8" );
        map1.put( 8, "String 9" );
        map1.put( 9, "String 10" );
        map1.put( 10, "String 11" );
        map1.put( 11, "String 12" );
        map1.put( 12, "String 13" );
        map1.put( 13, "String 14" );
        map1.put( 14, "String 15" );
        map1.put( 15, "String 16" );
        map1.put( 16, "String 17" );
        map1.put( 17, "String 18" );
        map1.put( 18, "String 19" );
        map1.put( 19, "String 20" );
        
        for(Integer key : map1.keySet()) {
            String value = map1.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
