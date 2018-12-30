/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Arrays;

/**
 *
 * @author a11411BCC031
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        ItemDeVenda itens[];
        itens = new ItemDeVenda[5];
        itens[0] = new Livro("Todas as Cronicas", 89.90, 10, "Lispector, Clarice");
        itens[1] = new CD("Raimundos - Roda Viva", 44.90, 15, 26);
        itens[2] = new DVD("Vingadores - Guerra Infinita", 29.90, 10, 149);
        itens[3] = new CD("Charlie Brown Jr. - Perfil", 18, 2, 16);
        itens[4] = new Livro("O Guia do Mochileiro Das Galáxias", 20.90, 3, "Adams,Douglas");
        System.out.println(Arrays.toString(itens));
        itens[4].elevarEstoque(10);
        itens[1].baixarEstoque(5);
        System.out.println(Arrays.toString(itens));
        itens[3].baixarEstoque(5);
        System.out.println(Arrays.toString(itens));

    }
    catch(EstoqueBaixoException e){
            System.out.println("\n" + e);
    
    }
}
    
}
