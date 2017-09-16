/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author estagiario
 */
public class Vendedor extends Funcionario {

    private double salarioBase;
    private double comissao;
    private double acumuloVendaMes;

    public Vendedor() {
        this.acumuloVendaMes = 0;
        this.comissao=5;
    }

    public void vender(double valor) {
        acumuloVendaMes += valor;

    }

    public double calcularSalario() {
        return salarioBase +(acumuloVendaMes*(comissao/100));
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
