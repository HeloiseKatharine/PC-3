/*
Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um Set, percorra todos os elementos utilizando forenhanced
(for-each) e calcule a média.
 */
package trabalho1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Heloise
 */
public class Questao11 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(100);
        numeros.add(20);
        numeros.add(30);
        numeros.add(80);
        numeros.add(40);
        numeros.add(100);
        numeros.add(200);
        
        float media = 0;
        float soma = 0;
        
        for(Integer y: numeros)
        {
            soma = y + soma;
        }
        float tam = numeros.size();
        media = soma/tam;
        System.out.println(media);
    }
}
