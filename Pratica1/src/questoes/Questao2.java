/*
2) Usando o ArrayList do exercício 1, faça as seguintes operações:
a) adicione um elemento na primeira posição da lista;
b) remova o terceiro elemento da lista;
c) copie o ArrayList para outro;
d) ordene o ArrayList de cores pelo nome
 */
package questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class Questao2 {
     public static void main(String[] args) {
        List lista = new ArrayList();
        
        lista.add("Azul");
        lista.add("Preto");
        lista.add("Amarelo");
        lista.add("Verde");
        lista.add("Cinza");
        
        System.out.println(lista);
        
        //a) adicione um elemento na primeira posição da lista;
        lista.add(0, "Vermelho");
        System.out.println(lista);
        
        //b) remova o terceiro elemento da lista;
        lista.remove(2);
        System.out.println(lista);
        
        //c) copie o ArrayList para outro;
        List lista2 = new ArrayList();
        lista2.addAll(lista);
        System.out.println("Lista 2:");
        System.out.println(lista2);
        
        //d) ordene o ArrayList de cores pelo nome
        Collections.sort(lista); 
        System.out.println(lista);
    }
}
