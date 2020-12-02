/*
4. Utilizando a classe Collections pesquise por “String 2” na coleção criada no exercício 2. Imprima
(System.out.println()) o resultado.
 */
package trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Heloise
 */
public class Questao4 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        List lista = new ArrayList();
        List encontrado = new ArrayList();
        lista.add("String 1");
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");

        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 3");

        System.out.println("Lista:");
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("Nome procurado:");
        int index = Collections.binarySearch(lista, "String 1");
        System.out.println(index);
        System.out.println(lista.get(index));
        
    }
}