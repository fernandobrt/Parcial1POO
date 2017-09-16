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
public class Gerente extends Empregado{
    String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    public String toString() {

        String s = "";

        s += "\n Nome: " + getNome();
        s += "\n Idade: " + getIdade();
        s += "\n Matricula: " + getMatricula();
        s += "\n Nome da Gerancia: " + getNomeGerencia();
        s += "\n Valor do INSS: " + getInss();

        return s;
    }
}