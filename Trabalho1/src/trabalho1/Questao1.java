/*
1. Implemente uma classe que possua um ArrayList e insira 200 Strings nesta lista.
 */
package trabalho1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class Questao1 {
    public static void main(String[] args) {
        
        List lista = new ArrayList(); //lista de tamanho indeterminado 
        int i;
        
        String a = "Olá";
        
        //Adicionando elementos na lista 
        for(i=0; i<200; i++){
            lista.add(a);
        }
        
        for(int j=0; j<200; j++){
            System.out.println(lista.get(j));//Exibe os elementos da //lista
            }       
    }
}
