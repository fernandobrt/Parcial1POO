/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author estagiario
 */
public class Vendedor extends Empregado {
   private double valorVendas;
   private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
   
    public String toString() {

        String s = "";

        s += "\n Nome: " + getNome();
        s += "\n Salario: " + getSalarioBase();
        s += "\n Valor das Vendas: " + getValorVendas();
        s += "\n Quantidade de Vendas: " + getQntVendas();
        

        return s;
    }
    
    
}
