/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author estagiario
 */
public class ContaPoupanca extends ContaBancaria {
    private int rendimento;

    public int getRendimento() {
        return rendimento;
    }

    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }
    
    
    public void calcularNovoSaldo(double taxa){
        
        double s= getSaldo()+(getSaldo()*(taxa/100));
        
      
        
       setSaldo(s); 
        
    }
    
}
