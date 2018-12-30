/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author Wellyngon Marques Borges
 */
public class Cliente {
    
    int id;
    int count =  0;
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
    return nome;
}

    public Cliente(String nome) {
        this.nome = nome;
        this.id = ++count;
    }
    
   
    
    
}
