/*
13 - Crie uma classe Aluno com os atributos Nome , RG e data de nascimento. Sobrescreva o método equals() de
forma que dois alunos sejam considerados iguais apenas se possuírem o mesmo RG.
 */
package trabalho1;

import java.util.Objects;

/**
 *
 * @author Heloise
 */
public class Aluno {
        
        String nome;
        Integer rg;
        String dataDeNascimento;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        return true;
    }
        
   
    public Aluno(String nome, Integer rg, String dataDeNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    } 
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
