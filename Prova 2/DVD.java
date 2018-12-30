/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author a11411BCC031
 */
public class DVD extends ItemDeVenda{
    float duracao;

    
    
    public DVD(String nome, double preco, int estoque, float duracao) {
        super(nome, preco, estoque);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\n DVD{ID: "+ DVD.super.id + " Nome: " + DVD.super.nome + ", Preço: "+ DVD.super.preco + ", Quantidade em estoque: " + DVD.super.estoque + ", Duração: " + duracao + '}';
    }
    

    
    
    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    
}
