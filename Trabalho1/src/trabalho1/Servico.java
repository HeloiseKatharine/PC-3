/*
6. Crie uma classe chamada Servico que tenha os seguintes atributos: codigo, descricao, precoHora, qtdeHora. 
Deve-se criar um método que calcule o valor do serviço da seguinte forma: valor = precoHora*qtdHora. O preço
da hora de serviço deve ser atribuído no momento da criação do objeto da classe. Sobrescreva o método
compareTo para fazer a ordenação pela descricao. Crie, também, uma classe usuária de Servico que leia vários
serviços, até o usuário decida parar de digitar, e guarde-os em uma coleção e no final imprima a lista na ordem
que foi digitada e na ordem alfabética da Descrição.
 */

/*Incompleto*/


package trabalho1;

/**
 *
 * @author Heloise
 */
public class Servico {
    
        String codigo;
        String descricao;
        Float precoHora;
        Float qtdeHora; 
      
     public void valorServico( Float precoHora, Float qtdeHora){
         Float valor;
         valor = precoHora*qtdeHora;
            
        }

    public Servico(String codigo, String descricao, Float precoHora, Float qtdeHora) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.qtdeHora = qtdeHora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Float precoHora) {
        this.precoHora = precoHora;
    }

    public Float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(Float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }
  
}