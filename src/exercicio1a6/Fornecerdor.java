/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1a6;

/**
 *
 * @author fbrito
 */
public class Fornecerdor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecerdor(String n, String e, String t) {
       
        super(n,e,t);
    }

    

    public double obterSaldo() {

        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

}
