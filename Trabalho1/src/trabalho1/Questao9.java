/*
9.Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra todos os elementos utilizando 
for- enhanced (for-each) e calcule a média.
 */
package trabalho1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class Questao9 {
    public static void main(String[] args) {
      
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(100);
        lista.add(20);
        lista.add(200);
        lista.add(30);
        lista.add(80);
        lista.add(40);
        lista.add(100);
        lista.add(200);

        float media = 0;
        float soma = 0;
        
        for(Integer x: lista)
        {
            soma = x + soma;
        }
        float tam = lista.size();
         media = soma/tam;
         System.out.println(media);
    }
}
