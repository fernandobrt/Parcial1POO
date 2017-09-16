/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author estagiario
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Operario o  = new Operario("Fernando x","82564465","Coahab");
        
        o.setSalarioBase(500);
        o.setImposto(7);
        o.setValorProducao(500);
        
        o.setComissao(50);
        
        
        double s = o.calcularSalario();
        System.out.println(s);
    }
    
}
