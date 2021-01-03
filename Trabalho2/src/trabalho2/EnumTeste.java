/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author Heloise
 */
public class EnumTeste {

    public static void main(String[] args) {
        //System.out.println(TipoPessoa.PESSOA_JURIDICA); 
        /*
        TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
        TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;
        System.out.println(tp1);
        System.out.println(tp1.name());
        System.out.println(tp1.toString());
         */

 /*
        System.out.println(EstadoCivil.CASADO.getValor());
        System.out.println(EstadoCivil.CASADO);

        System.out.println(EstadoCivil.SOLTEIRO.getValor());
        System.out.println(EstadoCivil.SOLTEIRO);*/
 /*
        System.out.println(Uf.DF);
        System.out.println(Uf.DF.getDescricao());

        System.out.println(Uf.GO);
        System.out.println(Uf.GO.getDescricao());*/
        System.out.println(Imposto.calcularImposto(115000.0, Taxa.ITBI));
        System.out.println(Imposto.calcularImposto(115000.0, Taxa.IPVA));

    }
}
