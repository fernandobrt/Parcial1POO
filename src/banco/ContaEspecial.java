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
public class ContaEspecial extends ContaBancaria {
    private float limite;

    
    
    
    public void sacar(double valor){
        
        if(valor>getSaldo()+limite){
            JOptionPane.showMessageDialog(null,"Saldo insufuciente");
        }else{
            setSaldo(getSaldo()-valor);
            
        }
        
    }
    
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
    
}
