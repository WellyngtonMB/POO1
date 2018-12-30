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
public class CD extends ItemDeVenda{
    int nFaixas;

    public CD(String nome, double preco, int estoque, int nFaixas) {
        super(nome, preco, estoque);
        this.nFaixas = nFaixas;
    }

    @Override
    public String toString() {
        return "\n CD{ID: "+ CD.super.id + " Nome: " + CD.super.nome + ", Preço: "+ CD.super.preco + ", Quantidade em estoque: " + CD.super.estoque + ", Número de Faixas:" + nFaixas + '}';
    }
    
    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
}

