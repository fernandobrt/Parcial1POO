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
public class Cliente extends Pessoa {
   private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
     public String toString() {

        String s = "";

        s += "\n Nome: " + getNome();
        s += "\n Idade: " + getIdade();
        s += "\n Sexo: " + getSexo();
        s += "\n Valor da divida: " + getAnoNascim();
        s += "\n Ano do nascimento: " + getAnoNascim();

        return s;
    
}
}