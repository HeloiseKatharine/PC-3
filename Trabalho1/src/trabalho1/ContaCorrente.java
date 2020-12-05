/*
15. Implemente uma classe ContaCorrente com os atributos Agencia, Numero, Nome, CPF e Saldo. Sobrescreva
os métodos equals() de forma que duas contas correntes sejam consideradas iguais apenas se possuírem o
mesmo Numero, e sobrescreva o método hashCode().
 */
package trabalho1;

import java.util.Objects;

/**
 *
 * @author Heloise
 */
public class ContaCorrente {
    String agencia;
    Integer numero;
    String nome;
    String cpf;
    String saldo;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.numero);
        return hash;
    }

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
        final ContaCorrente other = (ContaCorrente) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    public ContaCorrente(String agencia, Integer numero, String nome, String cpf, String saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "agencia=" + agencia + ", numero=" + numero + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo + '}';
    }
    
    
    
    
    
}
