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
public class Livro extends ItemDeVenda{
    String autor;

    public Livro(String nome, double preco, int estoque, String autor) {
        super(nome, preco, estoque);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\n Livro{ID: "+ Livro.super.id + " Nome: " + Livro.super.nome + ", Preço: "+ Livro.super.preco + ", Quantidade em estoque: " + Livro.super.estoque + ", Autor: " + autor + '}';
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
