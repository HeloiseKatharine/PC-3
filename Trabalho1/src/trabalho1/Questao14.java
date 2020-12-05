/*
14. Compare o desempenho das coleções HashMap e HashSet. Insira nas duas coleções um total de 20.000
alunos (da classe do exercício anterior) e pesquise por um deles, compare o tempo de pesquisa em cada uma
das coleções.
 */
package trabalho1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import trabalho1.Aluno;

/**
 *
 * @author Heloise
 */
public class Questao14 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        Set<Aluno> alunos = new HashSet<>();

        Aluno[] aluno = new Aluno[10];
         
        String nome = "Alunoo";
        Integer rg = 0102;
        String dataDeNascimento = "21/21/2020";
        
        for(int i = 0; i<10; i++){
            aluno[i] = new Aluno(nome, rg, dataDeNascimento);
            alunos.add(aluno[i]);
        }
        
        Iterator<Aluno> it = alunos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
