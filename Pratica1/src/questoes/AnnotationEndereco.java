/*
7) Crie uma annotation chamada AnnotationEndereco, que tenha os
seguintes elementos: logradouro, numero, bairro, cidade e estado. Use default “S/N” para número, caso o valor não seja passado. 
Mostre um exemplo de uso dessa annotation. Dica: use como base o item “4. Criando Annotations” da aula 4.
 */
package questoes;

/**
 *
 * @author Heloise
 */
public @interface AnnotationEndereco {
    
    String logradouro();
    String numero() default "S/N" ;
    String bairro();
    String cidade();
    String estado();
    
   

   
    
}
