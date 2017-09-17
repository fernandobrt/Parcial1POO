/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1a7;

/**
 *
 * @author estagiario
 */
public class Exercicio6 {
     public static void main(String[] args) {
        
        Vendedor v  = new Vendedor("Fernando x","82564465","Coahab");
        
        v.setSalarioBase(500);
        v.setImposto(7);
        v.setValorVendas(500);
        
        v.setComissao(50);
        
        
        double s = v.calcularSalario();
        System.out.println(s);
    }
    
    
}
