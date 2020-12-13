/*
Crie uma classe chamada Reflexao e crie, dentro dela, dois
métodos, um para mostrar os atributos de uma classe, que será
recebida pelo nome como parâmetro e outro para mostrar os
métodos dessa classe. Crie uma classe chamada Teste, com o
método main, e use a classe Reflexao para mostrar os métodos e os
atributos da classe mostrada a seguir. Dica: use a ativdade 4 da
aula 3 como base.
 */
package questoes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Heloise
 */
public class Reflexao {
    
    public static void printAtributo(Class<?> nome)
    {
        System.out.println("Exibindo lista de atributos, exceto os herdados");
        
        for(Field f : nome.getDeclaredFields()){
        System.out.println(f.getName());
        }
        
        System.out.println("Exibindo lista de atributos, exceto os privados");
        
        for(Field f : nome.getFields()){
        System.out.println(f.getName());
        }
        
    }
    
    public static void exibirDadosDosMetodos(Class<?> c) {
        
        System.out.println("Exibindo lista de métodos , exceto os herdados");

        for(Method m : c.getDeclaredMethods()){
        System.out.println(m.getName());
        }

        System.out.println("Exibindo lista de métodos, exceto os privados");

        for(Method m : c.getMethods()){
        System.out.println(m.getName());
        }
    
    }
    
    
}
