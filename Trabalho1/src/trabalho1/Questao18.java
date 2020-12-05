/*
18. Implemente código com a estrutura de dados definida no exercício anterior, adicione alguns alunos com o
mesmo RG, utilize a classe Aluno do exercício 13. Percorra todos os elementos, observe o resultado. Existem
alunos nesta turma com o mesmo código?
 */
package trabalho1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Heloise
 */
public class Questao18 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        Set<Aluno> alunos = new HashSet<>();
        
        Aluno aluno1 = new Aluno("Zahid", 0102, "01/01/2020");
        Aluno aluno2 = new Aluno("Aisha", 0102, "01/01/2020");
        Aluno aluno3 = new Aluno("João", 0100, "01/01/2020");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        Iterator<Aluno> it = alunos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
