/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author estagiario
 */
public class ContaBancaria {

    private String cliente;
    private int numConta;
    private double saldo;
    
    
    
    
    public void depositar(double valor){
        
        saldo +=valor;
        
    }
    
    public void sacar(double valor){
        
        if(valor>saldo){
         JOptionPane.showMessageDialog(null,"Saldo insufuciente");
        }else{
            saldo-=valor;
            //saldo=saldo-valor;
        }
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
    

}
