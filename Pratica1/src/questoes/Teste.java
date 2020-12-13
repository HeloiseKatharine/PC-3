/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes;

/**
 *
 * @author heloh
 */
public class Teste {
    public static void main(String[] args)throws ClassNotFoundException {
      
        
        Reflexao.exibirDadosDosMetodos(Class.forName("questoes.Teste"));
        Reflexao.printAtributo(Class.forName("questoes.Teste"));
     
    }   
    String nome;
    int idade;
    String cpf;
    String rg;
    
    public Teste(String nome, int idade, String cpf, String rg){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.rg = rg;
    }
    
    public String getNome() {
    return nome;
    }
    
    public int getIdade() {
    return idade;
    }
    
    public String getCpf() {
    return cpf;
    }
    
    public String getRg() {
    return rg;
    }
}

