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
public class ItemDeVenda {
    
    int id;
    String nome;
    double preco;
    int estoque;
    private static int count = 0; // verificar se é final ou static

    public ItemDeVenda(String nome, double preco, int estoque) {
        this.id = ++count;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void baixarEstoque (int quantidade) throws EstoqueBaixoException{
        if (estoque < quantidade){
            EstoqueBaixoException erro = new EstoqueBaixoException();
            throw erro;
        }else{
            estoque -= quantidade;
        }
    }
    public void elevarEstoque (int quantidade){
        estoque += quantidade;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
 
}

class EstoqueBaixoException extends Exception {
    @Override
    public String toString() {
        return "Estoque insuficiente";
    }
}
