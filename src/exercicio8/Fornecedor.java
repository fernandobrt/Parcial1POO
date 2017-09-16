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
public class Fornecedor extends Pessoa{
    
    
    private double valorCredito;
    private double valorDivida;
    
    
        public String toString() {

        String s = "";

        s += "\n Nome: " + getNome();
        s += "\n Idade: " + getIdade();
        s += "\n Sexo: " + getSexo();
        s += "\n Valor de Credito: " + getValorCredito();
        s += "\n Valor da divida: " + getValorDivida();
        s += "\n Saldo: " + obterSaldo();
        return s;
        }
    
    public double obterSaldo(){
        
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
