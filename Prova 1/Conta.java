/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.util.ArrayList;

/**
 *
 * @author Wellyngton Maques Borges
 */
public class Conta {
    
    int nroConta;
    int count =0;
    Cliente cliente;
    ArrayList<Lancamento> lancamentos;

   
    public int getNroConta() {
        return nroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.lancamentos = new ArrayList<>();
        this.nroConta = ++count;
    }
      
  
    public void Adiciona (char tipo, String historico, double valor){
        Lancamento lancamento = new Lancamento (tipo, historico, valor);
        lancamentos.add(lancamento);
        
    }
            
    public void Listar(ArrayList<Lancamento> lancamentos){
        System.out.println("Exibindo lacamentos do cliente "+ getCliente().nome +":");
        for (int i = 0; i<lancamentos.size(); i++){
        System.out.println(lancamentos.get(i).data);
        System.out.println("Foi "+ lancamentos.get(i).historico + " no valor de "+ lancamentos.get(i).valor + "\n");
        
        }
    }

    public double CalculaSaldo(ArrayList<Lancamento> lancamentos){
        int total = 0;
        for (int i = 0; i<lancamentos.size(); i++){
            if(lancamentos.get(i).tipo == 'C'){
                total += lancamentos.get(i).valor;
            }else{
                total -= lancamentos.get(i).valor;
            }
        }                
        return total;
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo;
        Cliente cliente1 = new Cliente("Bacala");
        Cliente cliente2 = new Cliente("Wellyngton");
        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);
        
        conta1.Adiciona('C', "depositado saldo", 500);
        conta2.Adiciona('C', "adicionando saldo", 500);
        conta2.Adiciona('D', "retirando saldo", 250);
        conta1.Listar(conta1.lancamentos);
        saldo = conta1.CalculaSaldo(conta1.lancamentos);
        System.out.println("Saldo da conta1: " + saldo + "\n");
        conta2.Listar(conta2.lancamentos);
        saldo = conta2.CalculaSaldo(conta2.lancamentos);
        System.out.println("Saldo da conta2: " + saldo + "\n");
        
        
        
    }
    
}

