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
public class Operario extends Empregado{
    
    private double valorProducao;
    private double comissao;
    
    
    
     public double calcularSalario() {

        return super.calcularSalario() +(valorProducao*(comissao/100));
 
    }
     
    
    
    
    
    public Operario(String nome, String endereço, String telefone) {
        super(nome, endereço, telefone);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
}
