/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.util.Date;

/**
 *
 * @author Wellyngton Marques Borges
 */
public class Lancamento {
    Date data;
    char tipo;
    String historico;
    Double valor;

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public String getHistorico() {
        return historico;
    }

    public Double getValor() {
        return valor;
    }

    public Lancamento(char tipo, String historico, Double valor) {
        this.tipo = tipo;
        this.historico = historico;
        this.valor = valor;
        this.data = new Date();
    }
    
}
