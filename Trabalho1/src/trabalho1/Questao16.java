/*
16. Crie um HashSet e adicione 5 (cinco) ContaCorrente diferentes. Imprima o resultado (System.out.println()).
 */
package trabalho1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Heloise
 */
public class Questao16 {
    public static void main(String[] args) {
        
        Set<ContaCorrente> contas = new HashSet<>();
        
       /* public ContaCorrente(String agencia, Integer numero, String nome, String cpf, String saldo) */
            
        ContaCorrente conta1 = new ContaCorrente("dsd", 212021, "Heloise", "2121212154", "150,00");
        ContaCorrente conta2 = new ContaCorrente("dsd", 454545, "Zahid", "2121212154", "150,00");
        ContaCorrente conta3 = new ContaCorrente("dsd", 215461, "joão", "2121212154", "150,00");
        ContaCorrente conta4 = new ContaCorrente("dsd", 254561, "Maria", "2121212154", "150,00");
        ContaCorrente conta5 = new ContaCorrente("dsd", 287545, "MariaDB", "2121212154", "150,00");
        
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        
        Iterator<ContaCorrente> it = contas.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
