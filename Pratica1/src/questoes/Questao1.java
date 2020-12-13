/*
1) Escreva um programa em Java que crie um ArrayList adicione algumas cores (string) e as imprima na tela.
 */
package questoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class Questao1 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        
        lista.add("Azul");
        lista.add("Preto");
        lista.add("Amarelo");
        lista.add("Verde");
        lista.add("Cinza");
        
        System.out.println(lista);
    }
    
}
