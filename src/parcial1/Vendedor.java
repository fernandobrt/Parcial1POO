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
public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    @Override
    public double calcularSalario() {

        return super.calcularSalario() + (valorVendas * (comissao / 100));

    }

    public Vendedor(String nome, String endereço, String telefone) {
        super(nome, endereço, telefone);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
