/*
10. Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra todos os elementos utilizando um
Iterator e calcule a média.
 */
package trabalho1;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Heloise
 */
public class Questao10 {
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
        
        Double soma = 0.0;
        
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            soma = iterator.next() + soma;
        }
        
        float tam = lista.size();
        Double media = soma/tam;
        System.out.println(media);
     }
}
